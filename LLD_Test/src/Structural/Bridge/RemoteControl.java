package Structural.Bridge;

public abstract class RemoteControl {
    Device device;
    boolean powerOn;

    public RemoteControl(Device device) {
        this.device = device;
        this.powerOn = false;
    }

    void togglePower() {
        if(this.powerOn) {
            this.device.turnOff();
        } else {
            this.device.turnOn();
        }

        this.powerOn = !this.powerOn;
    }

    void volumeUp() {
        this.device.volumeUp();
    }

    void volumeDown() {
        this.device.volumeDown();
    }
}
