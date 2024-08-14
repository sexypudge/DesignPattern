package AbstractFactoryPattern.example;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(Type.WOODEN);
        Chair c = factory.createChair();
        c.creatingChair();
    }
}
