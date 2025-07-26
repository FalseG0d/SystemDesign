package Behavioural.State;

public class ErrorState implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {

    }

    @Override
    public void buyItem(VendingMachine vendingMachine, int id) {

    }

    @Override
    public void errorOccurred(VendingMachine vendingMachine, String errorMessage) {
        System.out.println(errorMessage);
    }

    @Override
    public void settleAmount(VendingMachine vendingMachine) {

    }
}
