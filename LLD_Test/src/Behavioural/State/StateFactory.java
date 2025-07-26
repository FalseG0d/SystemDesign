package Behavioural.State;

import java.util.HashMap;
import java.util.Map;

public class StateFactory {
    static Map<Machine_State, State> cache = new HashMap<Machine_State, State>();

    public static State getMachineState(Machine_State machineState) {
        if(cache.containsKey(machineState)) return cache.get(machineState);

        switch (machineState) {
            case IDLE_STATE: cache.put(machineState, new IdleState()); break;
            case HAS_MONEY_STATE: cache.put(machineState, new HasMoneyState()); break;
            case SETTLE_AMOUNT_STATE: cache.put(machineState, new SettleAmount()); break;
            case ERROR_STATE:cache.put(machineState, new ErrorState()); break;
        }

        return cache.get(machineState);
    }
}
