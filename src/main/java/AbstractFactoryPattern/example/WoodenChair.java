package AbstractFactoryPattern.example;

public class WoodenChair implements Chair {

    @Override
    public void creatingChair() {
        System.out.println("creating wooden chair");
    }
}
