package Structural.Flyweight.CompositeImpl;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static Map<String, Character> cache = new HashMap<String, Character>();

    public static Character getText(char character, String fontType, int size) {
        String key = character + "_" + fontType + "_" + size;
        return cache.computeIfAbsent(key, k -> new Character(character, fontType, size));
    }
}
