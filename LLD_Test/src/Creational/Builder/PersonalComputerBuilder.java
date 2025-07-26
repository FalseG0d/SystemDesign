package Creational.Builder;

public class PersonalComputerBuilder implements ComputerBuilder {
    Computer computer;

    public PersonalComputerBuilder() {
        this.computer = new Computer();
    }

    @Override
    public ComputerBuilder buildRam() {
        this.computer.setRam(4);
        return this;
    }

    @Override
    public ComputerBuilder buildMemory() {
        this.computer.setMemory(500);
        return this;
    }

    @Override
    public ComputerBuilder buildCpu() {
        this.computer.setCpu("i5");
        return this;
    }

    @Override
    public Computer build() {
        return this.computer;
    }
}
