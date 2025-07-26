package Behavioural.State;

import java.util.List;

public class VendingMachine {
    State machineState;
    List<Integer> count;
    List<Integer> cost;
    int amount;

    VendingMachine(State machineState, List<Integer> count, List<Integer> cost) {
        this.machineState = machineState;
        this.count = count;
        this.cost = cost;
        this.amount = 0;
    }

    void setMachineState(State machineState) {
        this.machineState = machineState;
    }

    void loadUpMachine(List<Integer> count) {
        for(int i=0;i<count.size();i++) {
            this.count.set(i, this.count.get(i) + count.get(i));
        }
    }

    void setCount(List<Integer> cost) {
        for(int i=0;i<cost.size();i++) {
            this.cost.set(i, cost.get(i));
        }
    }

    List<Integer> getCount() {
        return this.count;
    }

    List<Integer> getCost() {
        return this.cost;
    }

    int getAmount() {
        return this.amount;
    }

    void setAmount(int amount) {
        this.amount = amount;
    }

    void buyItem(int id) {
        this.machineState.buyItem(this, id);
    }

    void insertMoney(int amount) {
        this.amount += amount;
        this.machineState.insertMoney(this, this.amount);
    }

    void errorOccurred(String errorMessage) {
        this.machineState.errorOccurred(this, errorMessage);
    }

    void settleAmount() {
        this.machineState.settleAmount(this);
    }
}
