package Behavioural.Strategy;

public class Thar extends Vehicle{
    Thar() {
        super(new OffRoadDriveStrategy());
    }
}
