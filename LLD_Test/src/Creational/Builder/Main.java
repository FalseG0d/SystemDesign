package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        ComputerBuilder gamingComputerBuilder = new GamingComputerBuilder();
        Computer gamingComputer = gamingComputerBuilder.buildRam().buildCpu().buildMemory().build();

        ComputerBuilder personalComputerBuilder = new PersonalComputerBuilder();
        Computer personalComputer = personalComputerBuilder.buildRam().buildCpu().buildMemory().build();

        System.out.println(gamingComputer);
        System.out.println(personalComputer);
    }
}
