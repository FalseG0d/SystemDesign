package Behavioural.ChainOfResponsibility;

import java.util.HashMap;

public abstract class MoneyChanger {
    MoneyChanger nextMoneyChanger;
    TYPE type;

    static int getTypeVal(TYPE type) {
        switch(type) {
            case TWO_THOUSAND: return 2000;
            case FIVE_HUNDRED: return 500;
            case HUNDRED: return 100;
            case FIFTY: return 50;
            case TWENTY: return 20;
            case TEN: return 10;
            default: return 0;
        }
    }

    MoneyChanger(TYPE type, MoneyChanger nextMoneyChanger) {
        this.type = type;
        this.nextMoneyChanger = nextMoneyChanger;
    }

    void dispense(int sum) {
        if(sum >= getTypeVal(this.type)) {
            System.out.println("Dispensing: " + getTypeVal(this.type));
            sum -= getTypeVal(this.type);
            this.dispense(sum);
        } else if(this.nextMoneyChanger != null) {
            this.nextMoneyChanger.dispense(sum);
        }
    }
}


