package AbstractFactoryPattern.product.chair;

public class PlasticChair implements Chair {
    public void create() {
        System.out.println("Create plastic chair");
    }
}
