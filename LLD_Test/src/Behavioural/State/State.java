package Behavioural.State;

public interface State {
    void insertMoney(VendingMachine vendingMachine, int amount);
    void buyItem(VendingMachine vendingMachine, int id);
    void errorOccurred(VendingMachine vendingMachine, String errorMessage);
    void settleAmount(VendingMachine vendingMachine);
}