package net.gunivers.dispenser.slimeball.operations.validation;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;
import org.eclipse.emf.ecore.EObject;

public class Validation<T extends EObject> {

    public static final Validation<BlockModel> minecraftBlockModelValidation;

    static {
        minecraftBlockModelValidation = new Validation<>(BlockModel.class, "validation/mc_block_model_validation.evl");
    }
    private final Class<T> modelElementClass;
    private final String validation;

    private Validation(Class<T> modelElementClass, String validation) {
        this.modelElementClass = modelElementClass;
        this.validation = validation;
    }

    public Class<T> getModelElementClass() {
        return modelElementClass;
    }

    String getValidation() {
        return validation;
    }
}
