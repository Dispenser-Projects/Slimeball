package net.gunivers.dispenser.slimeball;

import net.gunivers.dispenser.metamodel.minecraft.blockModel.BlockModel;
import net.gunivers.dispenser.slimeball.operations.transformation.Transformation;
import net.gunivers.dispenser.slimeball.operations.transformation.Transformer;
import net.gunivers.dispenser.slimeball.operations.validation.Validation;
import net.gunivers.dispenser.slimeball.operations.validation.Validator;
import net.gunivers.dispenser.slimeball.parsing.MinecraftModelParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Test {

    public static void main(String[] args) throws Exception {
        Configurator.setRootLevel(Level.INFO);

        MetamodelMetadata.init();

        final MinecraftModelParser parser = new MinecraftModelParser();
        final List<File> files = Files.list(Path.of("E:\\Programmation\\Dispenser\\Minecraft\\1.19.3\\assets\\minecraft\\models\\block")).map(Path::toFile).toList();
        final List<BlockModel> models = parser.parse(files, BlockModel.class);

        final Transformer transformer = new Transformer();
        final Validator validator = new Validator();

        models.forEach(model -> {
            try {
                validator.validate(model, Validation.minecraftBlockModelValidation);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        final var result = transformer.transform(models, Transformation.blockModelTransformation);
        System.out.println();
    }
}
