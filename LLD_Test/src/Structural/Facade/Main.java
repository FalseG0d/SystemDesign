package Structural.Facade;

public class Main {
    public static void main(String[] args) {
        MenuHandler menuHandler = new MenuHandlerImpl();

        System.out.println(menuHandler.starterMenu());
        System.out.println(menuHandler.vegMenu());
        System.out.println(menuHandler.nonvegMenu());
        System.out.println(menuHandler.dessertMenu());
    }
}
