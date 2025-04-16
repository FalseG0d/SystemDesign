package Structural.Decorator;

public class BrownSugar implements Beverage{
    Beverage beverage;

    BrownSugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 3;
    }

    @Override
    public String ingredients() {
        return beverage.ingredients() + " Brown Sugar";
    }
}
