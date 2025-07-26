package Behavioural.Strategy;

public class OffRoadDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        // Off Road Drive
        System.out.println("Offroad Drive");
    }
}
