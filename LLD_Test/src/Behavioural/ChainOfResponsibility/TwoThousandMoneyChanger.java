package Behavioural.ChainOfResponsibility;

public class TwoThousandMoneyChanger extends MoneyChanger {
    TwoThousandMoneyChanger(MoneyChanger nextMoneyChanger) {
        super(TYPE.TWO_THOUSAND, nextMoneyChanger);
    }
}
