package AbstractFactoryPattern.product.chair;

public class WoodChair implements Chair {
    public void create() {
        System.out.println("Create wood chair");
    }
}
