package Structural.Flyweight.CompositeImpl;

public class Text {
    Character character;
    int x,y;

    Text(Character character, int x, int y) {
        this.character = character;
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return this.character.toString() + "(" + this.x + ", " + this.y + ")";
    }
}
