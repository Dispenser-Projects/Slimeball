package net.gunivers.dispenser.slimeball;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModelPackage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import java.util.Arrays;
import java.util.Optional;

public enum MetamodelMetadata {

    MINECRAFT(BlockModelPackage.eINSTANCE, "Minecraft", "mc"),
    SLIMEBALL(net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModelPackage.eINSTANCE, "Slimeball", "sb");


    private final EPackage instance;
    private final String name;
    private final String extension;

    MetamodelMetadata(EPackage instance, String name, String extension) {
        this.instance = instance;
        this.name = name;
        this.extension = extension;
    }

    public EPackage getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public static Optional<MetamodelMetadata> getFromInstance(EPackage ePackage) {
        return Arrays.stream(values()).filter(element -> element.instance.equals(ePackage)).findFirst();
    }

    public static void init() {
        for(final MetamodelMetadata metadata: values()) {
            EPackage.Registry.INSTANCE.put(metadata.instance.getNsURI(), metadata.instance);
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(metadata.extension, new EcoreResourceFactoryImpl());
        }
    }
}
