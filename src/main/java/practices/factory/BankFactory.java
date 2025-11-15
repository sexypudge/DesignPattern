package practices.factory;

public class BankFactory {
    public static Bank getBank(BankEnum bankEnum) {
        switch (bankEnum) {
            case TPBank: return new TPBank();
            default: return null;

        }
    }
}
