package Behavioural.ChainOfResponsibility;

public class TenMoneyChanger extends MoneyChanger {
    TenMoneyChanger(MoneyChanger nextMoneyChanger) {
        super(TYPE.TEN, nextMoneyChanger);
    }
}
