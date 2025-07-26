package Behavioural.State;

public class SettleAmount implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {

    }

    @Override
    public void buyItem(VendingMachine vendingMachine, int id) {

    }

    @Override
    public void errorOccurred(VendingMachine vendingMachine, String errorMessage) {

    }

    @Override
    public void settleAmount(VendingMachine vendingMachine) {
        System.out.println("Returning Amount: " + vendingMachine.getAmount());
        vendingMachine.setMachineState(StateFactory.getMachineState(Machine_State.IDLE_STATE));
    }
}
