package Structural.Decorator;

public class Tea implements Beverage{
    Beverage beverage;

    Tea(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 4;
    }

    @Override
    public String ingredients() {
        return beverage.ingredients() + " Tea";
    }
}
