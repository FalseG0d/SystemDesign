package Structural.Flyweight.ClassicGoF;

public class Main {
    public static void main(String[] args) {
        IText text1 = TextFactory.createText('A', "Bold", 10);
        text1.display(0, 0);
        IText text2 = TextFactory.createText('p', "Normal", 10);
        text1.display(1, 0);
        IText text3 = TextFactory.createText('o', "Normal", 10);
        text1.display(2, 0);
        IText text4 = TextFactory.createText('o', "Normal", 10);
        text1.display(3, 0);
        IText text5 = TextFactory.createText('r', "Normal", 10);
        text1.display(4, 0);
        IText text6 = TextFactory.createText('v', "Normal", 10);
        text1.display(5, 0);
    }
}
