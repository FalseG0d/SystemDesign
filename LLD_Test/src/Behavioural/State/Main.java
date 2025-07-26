package Behavioural.State;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(
                StateFactory.getMachineState(Machine_State.IDLE_STATE),
                Arrays.asList(10, 12, 1, 8, 9),
                Arrays.asList(100, 120, 70, 80, 50)
        );

        vendingMachine.insertMoney(500);
        vendingMachine.buyItem(2);
        vendingMachine.buyItem(2);
        vendingMachine.buyItem(1);
        vendingMachine.settleAmount();
    }
}
