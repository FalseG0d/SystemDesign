package Structural.Facade;

public class MenuHandlerImpl implements MenuHandler {
    @Override
    public String dessertMenu() {
        Menu dessertMenu = new DessertMenu();
        return dessertMenu.getMenu();
    }

    @Override
    public String nonvegMenu() {
        Menu dessertMenu = new DessertMenu();
        return dessertMenu.getMenu();
    }

    @Override
    public String vegMenu() {
        VegMenu vegMenu = new VegMenu();
        return vegMenu.getMenu();
    }

    @Override
    public String starterMenu() {
        StarterMenu starterMenu = new StarterMenu();
        return starterMenu.getMenu();
    }
}
