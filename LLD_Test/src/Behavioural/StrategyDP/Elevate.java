package Behavioural.StrategyDP;

public class Elevate extends Vehicle{
    Elevate() {
        super(new SportsDriveStrategy());
    }
}