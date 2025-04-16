package Creational.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Shape circle = sf.getShape(ShapeType.CIRCLE);
        Shape square = sf.getShape(ShapeType.SQUARE);

        circle.draw();
        square.draw();
    }
}
