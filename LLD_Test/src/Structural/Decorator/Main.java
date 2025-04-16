package Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Beverage indianChai = new Milk(new Tea(new WhiteSugar(new Water())));

        System.out.println(indianChai.cost());
        System.out.println(indianChai.ingredients());
    }
}
