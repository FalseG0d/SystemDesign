package Structural.Flyweight.CompositeImpl;

public class Main {
    public static void main(String[] args) {
        Text t1 = new Text(CharacterFactory.getText('A', "Bold", 10), 0, 0);
        Text t2 = new Text(CharacterFactory.getText('p', "Normal", 10), 0, 1);
        Text t3 = new Text(CharacterFactory.getText('o', "Normal", 10), 0, 2);
        Text t4 = new Text(CharacterFactory.getText('o', "Normal", 10), 0, 3);
        Text t5 = new Text(CharacterFactory.getText('r', "Normal", 10), 0, 4);
        Text t6 = new Text(CharacterFactory.getText('v', "Normal", 10), 0, 5);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3); // t3 & t4 will use the same Character Object
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
    }
}
