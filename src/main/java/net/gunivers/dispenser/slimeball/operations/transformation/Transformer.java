package net.gunivers.dispenser.slimeball.operations.transformation;

import net.gunivers.dispenser.slimeball.MetamodelMetadata;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.etl.EtlModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Optional;

public class Transformer {

    private final static Logger logger = LoggerFactory.getLogger(Transformer.class);

    private final EtlModule module;
    public Transformer() {
        this.module = new EtlModule();
        this.module.getContext().setModule(module);
    }

    public <T extends EObject, U extends EObject> Collection<U> transform(Collection<T> source, Transformation<T, U> transformation) throws Exception {
        if(!source.isEmpty()) {
            final T firstElement = source.iterator().next();
            final EPackage packageInstance = firstElement.eClass().getEPackage();
            final String packageUri = packageInstance.getNsURI();
            final var sourceMetadataOpt = MetamodelMetadata.getFromInstance(packageInstance);
            final var targetMetadataOpt = Optional.ofNullable(EPackage.Registry.INSTANCE.getEPackage(transformation.getTarget().getPackageName()))
                                                  .flatMap(MetamodelMetadata::getFromInstance);

            if(sourceMetadataOpt.isPresent() && targetMetadataOpt.isPresent()) {

                final String transformationText;
                try(final var transformationStream = Transformer.class.getClassLoader().getResourceAsStream(transformation.getTransformation())) {
                    assert transformationStream != null;
                    final byte[] bytes = transformationStream.readAllBytes();
                    transformationText = new String(bytes, StandardCharsets.UTF_8);
                } catch(Exception e) {
                    logger.error(String.format("Cannot read transformation file at path '%s'.", transformation.getTransformation()));
                    throw e;
                }

                module.parse(transformationText);
                final MetamodelMetadata sourceMetadata = sourceMetadataOpt.get();
                final ResourceSet resourceSet = new ResourceSetImpl();
                resourceSet.getPackageRegistry().put(packageUri, packageInstance);
                final Resource inputResource = resourceSet.createResource(URI.createFileURI("input." + sourceMetadata.getExtension()));
                inputResource.getContents().addAll(source);

                final EmfModel inputModel = new InMemoryEmfModel(sourceMetadata.getName(), inputResource);
                final MetamodelMetadata targetMetadata = targetMetadataOpt.get();
                EmfModel outputModel = createModel("output." + targetMetadata.getExtension(), targetMetadata.getName(), targetMetadata.getInstance().getNsURI());

                module.getContext().getModelRepository().addModel(inputModel);
                module.getContext().getModelRepository().addModel(outputModel);

                logger.trace(String.format("Transforming an instance of '%s' to an instance of '%s'...", sourceMetadata.getName(), targetMetadata.getName()));
                module.execute();
                final var result = (Collection<U>) outputModel.getAllOfKind(transformation.getTarget().getSimpleName());
                logger.trace(String.format("%d elements transformed.", result.size()));

                return result;
            } else if(sourceMetadataOpt.isEmpty())
                logger.error("The source doesn't have a registered metamodel.");
            else
                logger.error("The target doesn't have a registered metamodel.");

        } else
            logger.error("The source cannot be empty.");
        return null;
    }

    private EmfModel createModel(String name, String metamodelName, String metamodelUri) throws EolModelLoadingException {
        EmfModel model = new EmfModel();
        model.setName(metamodelName);
        model.setReadOnLoad(false);
        model.setStoredOnDisposal(false);
        model.setModelFileUri(URI.createFileURI(name));
        model.setMetamodelUri(metamodelUri);
        model.load();
        return model;
    }
}
