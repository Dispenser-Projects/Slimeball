package net.gunivers.dispenser.slimeball.operations.validation;

import net.gunivers.dispenser.slimeball.MetamodelMetadata;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.evl.EvlModule;
import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Optional;
import java.util.Set;

public class Validator {
    private final static Logger logger = LoggerFactory.getLogger(Validator.class);

    private final EvlModule module;
    public Validator() {
        this.module = new EvlModule();
        this.module.getContext().setModule(module);
    }

    public <T extends EObject> Optional<Collection<String>> validate(T element, Validation<T> validation) throws Exception {
        logger.trace("Trying to validate a model...");
        final EPackage packageInstance = element.eClass().getEPackage();
        final String packageUri = packageInstance.getNsURI();
        final var elementMetadataOpt = MetamodelMetadata.getFromInstance(packageInstance);
        if(elementMetadataOpt.isPresent()) {
            module.parse(Validator.class.getClassLoader().getResource(validation.getValidation()));

            final MetamodelMetadata metadata = elementMetadataOpt.get();
            final ResourceSet resourceSet = new ResourceSetImpl();
            resourceSet.getPackageRegistry().put(packageUri, packageInstance);
            final Resource resource = resourceSet.createResource(URI.createFileURI("input." + metadata.getExtension()));
            resource.getContents().add(element);

            final EmfModel model = new InMemoryEmfModel(metadata.getName(), resource);
            module.getContext().getModelRepository().addModel(model);

            final Set<UnsatisfiedConstraint> result = module.execute();
            final var constraintList = result.stream()
                    .map(constraint -> { logger.info(constraint.getMessage()); return constraint.getMessage(); })
                    .toList();
            logger.trace(String.format("Model validated with %d constraint(s) violation.", constraintList.size()));
            return Optional.of(constraintList);
        }
        logger.error("The element doesn't have a registered metamodel.");
        return Optional.empty();
    }
}
