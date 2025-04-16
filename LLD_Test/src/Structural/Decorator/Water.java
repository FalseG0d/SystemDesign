package Structural.Decorator;

public class Water implements Beverage{
    @Override
    public double cost() {
        return 0;
    }

    @Override
    public String ingredients() {
        return "Water";
    }
}
