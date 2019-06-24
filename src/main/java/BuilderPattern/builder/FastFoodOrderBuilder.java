package BuilderPattern.builder;

import BuilderPattern.order.Order;
import BuilderPattern.type.BreadType;
import BuilderPattern.type.OrderType;
import BuilderPattern.type.SauceType;
import BuilderPattern.type.VegetableType;

public class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;

    private BreadType breadType;

    private SauceType sauceType;

    private VegetableType vegetableType;

    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }
}
