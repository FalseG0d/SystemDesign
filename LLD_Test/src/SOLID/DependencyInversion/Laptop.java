package SOLID.DependencyInversion;

public class Laptop {
    final Keyboard kb;
    final Mouse m;


    public Laptop(Keyboard kb, Mouse m) {
        this.kb = kb;
        this.m = m;
    }

    public static void main(String[] args) {
        Laptop lt = new Laptop(new WiredKeyboard(), new WiredMouse());
    }
}
