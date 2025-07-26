package Creational.Builder;

public class GamingComputerBuilder implements ComputerBuilder {
    Computer computer;

    public GamingComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public GamingComputerBuilder buildRam() {
        this.computer.setRam(64);
        return this;
    }

    @Override
    public GamingComputerBuilder buildMemory() {
        this.computer.setMemory(5000);
        return this;
    }

    @Override
    public GamingComputerBuilder buildCpu() {
        this.computer.setCpu("i9");
        return this;
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
