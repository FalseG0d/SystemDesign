package Behavioural.ChainOfResponsibility;

public class FiftyMoneyChanger extends MoneyChanger {
    FiftyMoneyChanger(MoneyChanger nextMoneyChanger) {
        super(TYPE.FIFTY, nextMoneyChanger);
    }
}