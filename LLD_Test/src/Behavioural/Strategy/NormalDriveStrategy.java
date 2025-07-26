package Behavioural.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        // Normal Drive
        System.out.println("Normal Drive");
    }
}
