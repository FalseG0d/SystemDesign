package Creational.Builder;

public interface ComputerBuilder {
    ComputerBuilder buildRam();
    ComputerBuilder buildMemory();
    ComputerBuilder buildCpu();
    Computer build();
}
