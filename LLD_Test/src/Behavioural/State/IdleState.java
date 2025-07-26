package Behavioural.State;

public class IdleState implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {
        vendingMachine.setMachineState(StateFactory.getMachineState(Machine_State.HAS_MONEY_STATE));
    }

    @Override
    public void buyItem(VendingMachine vendingMachine, int id) {
        vendingMachine.setMachineState(StateFactory.getMachineState(Machine_State.ERROR_STATE));
        vendingMachine.errorOccurred("Not Enough Balance");
    }

    @Override
    public void errorOccurred(VendingMachine vendingMachine, String errorMessage) {

    }

    @Override
    public void settleAmount(VendingMachine vendingMachine) {

    }
}
