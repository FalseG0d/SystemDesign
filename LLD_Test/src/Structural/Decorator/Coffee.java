package Structural.Decorator;

public class Coffee implements Beverage {
    Beverage beverage;

    Coffee(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String ingredients() {
        return beverage.ingredients() + " Coffee";
    }
}
