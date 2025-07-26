package Behavioural.Strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle elevate = new Elevate();
        Vehicle thar = new Thar();

        elevate.drive();
        thar.drive();
    }
}
