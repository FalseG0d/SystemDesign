package Behavioural.ChainOfResponsibility;

public class FiveHundredMoneyChanger extends MoneyChanger {
    FiveHundredMoneyChanger(MoneyChanger moneyChanger) {
        super(TYPE.FIVE_HUNDRED, moneyChanger);
    }
}
