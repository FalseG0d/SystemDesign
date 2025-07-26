package Creational.Builder;

public class Computer {
    String cpu;
    int ram;
    int memory;

    Computer() {

    }

    Computer(String cpu, int ram, int memory) {
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "=" + this.ram + ", " + this.memory + ", " + this.cpu;
    }
}
