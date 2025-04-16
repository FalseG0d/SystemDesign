package Structural.Decorator;

public class Milk implements Beverage{
    Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String ingredients() {
        return beverage.ingredients() + " Milk";
    }
}
