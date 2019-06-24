package FactoryPattern;

import static FactoryPattern.BankType.TPBANK;
import static FactoryPattern.BankType.VIETCOMBANK;

public class BankFactory {

    private BankFactory() {
    }

    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK:
                return new TPBank();

            case VIETCOMBANK:
                return new VietcomBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
