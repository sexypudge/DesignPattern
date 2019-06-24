package BuilderPattern;

import BuilderPattern.builder.BankAccount;
import BuilderPattern.builder.FastFoodOrderBuilder;
import BuilderPattern.order.Order;
import BuilderPattern.type.BreadType;
import BuilderPattern.type.OrderType;
import BuilderPattern.type.SauceType;
import BuilderPattern.type.VegetableType;

public class BuilderClient {
    public static void main(String[] args) {
        // create object with builder class using interface
        Order order = new FastFoodOrderBuilder()
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.FISH_SAUCE)
                .orderVegetable(VegetableType.CUCUMBER)
                .orderType(OrderType.ON_SITE)
                .build();
        System.out.println(order);

        // immutable builder class
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("GP Coder", "0123456789")
                .withEmail("contact@gpcoder.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
