package net.gunivers.dispenser.slimeball.operations.transformation;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;
import org.eclipse.emf.ecore.EObject;

public class Transformation<T extends EObject, U extends EObject> {

    private static final String transformationPath = "transformation/";
    public static final Transformation<BlockModel, net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel> blockModelTransformation;

    static {
        blockModelTransformation = new Transformation<>(BlockModel.class, net.gunivers.dispenser.metamodel.slimeball.blockModel.BlockModel.class, "model_mc_to_sb_transformation.etl");
    }

    private final Class<T> source;
    private final Class<U> target;
    private final String transformation;

    private Transformation(Class<T> source, Class<U> target, String transformation) {
        this.source = source;
        this.target = target;
        this.transformation = transformationPath + transformation;
    }

    public Class<T> getSource() {
        return source;
    }

    public Class<U> getTarget() {
        return target;
    }

    String getTransformation() {
        return transformation;
    }
}
