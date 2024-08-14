package FactoryPattern;

public class Main {
    private Bank bank;

    public Main(Bank bank) {
        this.bank = bank;
    }

    public static void main(String[] args) {
        Bank bank = BankFactory.getBank(BankType.VIETCOMBANK);
        System.out.println(bank.getBankName());

        Main main = new Main(bank);
    }
}
