package Behavioural.ChainOfResponsibility;

public class ATM {
    public static void main(String[] args) {
        TwoThousandMoneyChanger moneyChanger = new TwoThousandMoneyChanger(
                new FiveHundredMoneyChanger(
                    new HundredMoneyChanger(
                        new FiftyMoneyChanger(
                                new TwentyMoneyChanger(
                                        new TenMoneyChanger(null)
                                )
                        )
                )
            )
        );

        int amount = 3730;

        moneyChanger.dispense(amount);
    }
}
