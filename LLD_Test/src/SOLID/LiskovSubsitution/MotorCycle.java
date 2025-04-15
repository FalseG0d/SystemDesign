package SOLID.LiskovSubsitution;

public class MotorCycle extends Cycle{
    boolean engineRunning;

    MotorCycle() {
        engineRunning = false;
    }

    @Override
    public void accelerate() {
        speed += 20;
    }

    public void startEngine() {
        engineRunning = true;
    }

    public void stopEngine() {
        engineRunning = false;
    }
}
