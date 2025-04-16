package Structural.Decorator;

public class WhiteSugar implements Beverage{
    Beverage beverage;

    WhiteSugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 2;
    }

    @Override
    public String ingredients() {
        return beverage.ingredients() + " White Sugar";
    }
}
