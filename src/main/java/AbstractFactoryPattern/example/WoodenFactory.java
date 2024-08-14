package AbstractFactoryPattern.example;

public class WoodenFactory extends FurnitureAbstractFactory {
    @Override
    Table createTable() {
        return new WoodenTable();
    }

    @Override
    Chair createChair() {
        return new WoodenChair();
    }

}
