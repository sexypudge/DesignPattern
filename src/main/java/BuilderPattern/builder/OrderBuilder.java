package BuilderPattern.builder;


import BuilderPattern.order.Order;
import BuilderPattern.type.BreadType;
import BuilderPattern.type.OrderType;
import BuilderPattern.type.SauceType;
import BuilderPattern.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
