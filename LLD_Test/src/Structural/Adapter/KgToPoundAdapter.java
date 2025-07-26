package Structural.Adapter;

public class KgToPoundAdapter implements WeighingMachineAdapter{
    WeighingMachine wm;

    public KgToPoundAdapter(WeighingMachine wm) {
        this.wm = wm;
    }

    @Override
    public float getWeight() {
        return (float) (wm.getWt() / 0.45);
    }
}
