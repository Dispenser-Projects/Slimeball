package net.gunivers.dispenser.slimeball.parsing;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.TextNode;
import com.google.common.collect.ImmutableList;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;


class Deserializer {

    private final ObjectMapper mapper;

    public Deserializer() {
        this.mapper = new ObjectMapper();
    }

    public <T> T parse(String modelName, InputStream content, Class<T> clazz) throws IOException {
            final JsonParser parser = mapper.createParser(content);
            final JsonNode node = parser.getCodec().readTree(parser);
            final var ePackage = EPackage.Registry.INSTANCE.getEPackage(clazz.getPackageName());
            if(ePackage == null)
                throw new IllegalArgumentException("The source doesn't have a registered metamodel.");
            return (T) deserialize(node, modelName, clazz.getSimpleName(), ePackage);
    }

    private EObject deserialize(JsonNode node, String filename, String conceptId, EPackage ePackage) {

        final EClassifier classifier = ePackage.getEClassifier(conceptId);
        if (classifier instanceof final EClass clazz) {
            final EObject instance = EcoreUtil.create(clazz);
            for (final var feature : clazz.getEStructuralFeatures()) {
                final String attributeName = feature.getName();
                if(attributeName.equals("_name"))
                    instance.eSet(feature, filename);
                else if (node.get(attributeName) != null)
                    instance.eSet(feature, deserializeJsonNode(node.get(attributeName), filename, feature.getEType(), feature.isMany(), ePackage));
            }
            return instance;
        }
        return null;
    }

    private Object deserializeJsonNode(JsonNode node, String filename, EClassifier eType, boolean isMany, EPackage ePackage) {
        final String eTypeName = eType.getInstanceClass().getSimpleName();
        if(eTypeName.equals("Entry") && isMany) { // Case Map$Entry
            final var entryClass = (EClass) eType;
            final var keyType = entryClass.getEStructuralFeatures().get(0).getEType();
            final var valueType = entryClass.getEStructuralFeatures().get(1).getEType();
            final Map<Object, Object> map = new HashMap<>();
            ImmutableList.copyOf(node.fields()).forEach(entry ->
                    map.put(deserializeJsonNode(TextNode.valueOf(entry.getKey()), filename, keyType, false, ePackage),
                            deserializeJsonNode(entry.getValue(), filename, valueType, false, ePackage)
                    ));
            return map;
        } else if(isMany) {
            final EList<Object> list = new BasicEList<>();
            ImmutableList.copyOf(node.elements()).forEach(elem -> list.add(deserializeJsonNode(elem, filename, eType, false, ePackage)));
            return list;
        }

        if (eType instanceof EEnum eEnum)
            return eEnum.getEEnumLiteral(node.asText()).getInstance();

        return switch(eTypeName) {
            case "Integer" -> node.asInt();
            case "Float"   -> Double.valueOf(node.asDouble()).floatValue();
            case "Double"  -> node.asDouble();
            case "Boolean" -> node.asBoolean();
            case "String"  -> node.asText();
            default        -> deserialize(node, filename, eTypeName, ePackage);
        };
    }
}
