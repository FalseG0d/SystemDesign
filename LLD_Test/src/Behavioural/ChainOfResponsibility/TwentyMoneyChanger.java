package Behavioural.ChainOfResponsibility;

public class TwentyMoneyChanger extends MoneyChanger {
    TwentyMoneyChanger(MoneyChanger nextMoneyChanger) {
        super(TYPE.TWENTY, nextMoneyChanger);
    }
}
