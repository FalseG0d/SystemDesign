package Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        WeighingMachineAdapter wma = new KgToPoundAdapter(new WeighingMachine(76));

        float wtInPound = wma.getWeight();

        System.out.println(wtInPound);
    }
}
