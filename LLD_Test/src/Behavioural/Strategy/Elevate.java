package Behavioural.Strategy;

public class Elevate extends Vehicle{
    Elevate() {
        super(new SportsDriveStrategy());
    }
}