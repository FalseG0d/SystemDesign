package Behavioural.State;

import java.util.List;

public class HasMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine vendingMachine, int amount) {

    }

    @Override
    public void buyItem(VendingMachine vendingMachine, int id) {
        if(vendingMachine.getCount().get(id) > 0) {
            // Item Available
            if(vendingMachine.getAmount() >= vendingMachine.getCost().get(id)) {
                // Dispensing Item
                List<Integer> newCount = vendingMachine.getCount();

                vendingMachine.setAmount(vendingMachine.getAmount() - vendingMachine.getCost().get(id));
                newCount.set(id, newCount.get(id) - 1);
                System.out.println("Buying Item: " + id);
                System.out.println("Items Left: " + newCount.get(id));
                vendingMachine.setCount(newCount);
            } else {
                vendingMachine.setMachineState(StateFactory.getMachineState(Machine_State.ERROR_STATE));
                vendingMachine.errorOccurred("Not Enough Balance");
            }
        } else {
            // Item not Available
            vendingMachine.setMachineState(StateFactory.getMachineState(Machine_State.ERROR_STATE));
            vendingMachine.errorOccurred("Item Not Available");
        }
    }

    @Override
    public void errorOccurred(VendingMachine vendingMachine, String errorMessage) {

    }

    @Override
    public void settleAmount(VendingMachine vendingMachine) {
        vendingMachine.setMachineState(StateFactory.getMachineState(Machine_State.SETTLE_AMOUNT_STATE));
        vendingMachine.settleAmount();
    }
}
