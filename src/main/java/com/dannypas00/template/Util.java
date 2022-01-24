package com.dannypas00.template;

import net.minecraft.util.Identifier;

public class Util {
    private static final String[] excludedSuffixFromNamespace = new String[]{
            "Item",
            "Block",
            "BlockItem",
            "Entity",
            "Tool",
            "Weapon",
            "Material"
    };

    public static <T> String pathFromClass(Class<T> tClass) {
        String className = tClass.getSimpleName();
        className = removeExcludedSuffix(className);
        return stringToSnake(className);
    }

    public static <T> Identifier createIdentifierFromClass(Class<T> tClass) {
        String path = pathFromClass(tClass);
        return new Identifier(ModInfo.MOD_ID, path);
    }

    public static <T> Identifier createIdentifierFromClass(Class<T> tClass, boolean plural) {
        String path = pathFromClass(tClass);
        if (plural) {
            path += "s";
        }
        return new Identifier(ModInfo.MOD_ID, path);
    }

    private static String removeExcludedSuffix(String className) {
        String excludeString = String.join("|", excludedSuffixFromNamespace);
        String excludeRegex  = String.format("(%s)$", excludeString);
        return className.replaceAll(excludeRegex, "");
    }

    public static String stringToSnake(String input) {
        return input
                .replaceAll("([A-Z]+)([A-Z][a-z])", "$1_$2")
                .replaceAll("([a-z])([A-Z])", "$1_$2")
                .toLowerCase();
    }
}
