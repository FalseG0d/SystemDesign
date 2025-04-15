package Behavioural.StrategyDP;

public class Thar extends Vehicle{
    Thar() {
        super(new OffRoadDriveStrategy());
    }
}
