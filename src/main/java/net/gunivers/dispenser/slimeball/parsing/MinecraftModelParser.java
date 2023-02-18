package net.gunivers.dispenser.slimeball.parsing;

import org.eclipse.emf.ecore.EObject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MinecraftModelParser {

    private final Deserializer deserializer;

    public MinecraftModelParser() {
        this.deserializer = new Deserializer();
    }

    public <T extends EObject> List<T> parse(List<File> modelFiles, Class<T> eClass) throws IOException {
        final List<T> eObjects = new ArrayList<>(modelFiles.size());
        for(final var file : modelFiles) {
            final String modelName = file.getName().split("\\.")[0];
            final InputStream content = new FileInputStream(file);
            eObjects.add(deserializer.parse(modelName, content, eClass));
        }
        return eObjects;
    }

}
