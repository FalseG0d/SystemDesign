package Structural.Flyweight.CompositeImpl;

public class Character {
    private char character;
    private String fontType;
    private int size;

    Character(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }
}
