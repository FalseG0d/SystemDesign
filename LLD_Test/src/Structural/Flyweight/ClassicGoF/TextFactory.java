package Structural.Flyweight.ClassicGoF;

import java.util.HashMap;
import java.util.Map;

public class TextFactory {
    private static Map<String,IText> cache = new HashMap<>();

    public static IText createText(char character, String fontType, int size) {
        if(cache.containsKey(character + fontType + size)) {
            return cache.get(character + fontType + size);
        } else {
            Text newText = new Text(character, fontType, size);
            cache.put(character + fontType + size, newText);
            return newText;
        }
    }
}
