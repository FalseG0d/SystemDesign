package Structural.Flyweight.ClassicGoF;

public class Text implements IText {
    private char character;
    private String fontType;
    private int size;

    private int x;
    private int y;

    Text(char character, String fontType, int size) {
        this.character = character;
        this.fontType = fontType;
        this.size = size;
    }

    @Override
    public void display(int x, int y) {
        this.x = x;
        this.y = y;

        // Render on x & y
    }
}
