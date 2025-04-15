package Behavioural.StrategyDP;

public class Vehicle {
    public DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
