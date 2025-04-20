package Behavioural.ChainOfResponsibility;

public class HundredMoneyChanger extends MoneyChanger {
    HundredMoneyChanger(MoneyChanger nextMoneyChanger) {
        super(TYPE.HUNDRED, nextMoneyChanger);
    }
}
