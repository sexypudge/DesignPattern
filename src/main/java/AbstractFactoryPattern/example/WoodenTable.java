package AbstractFactoryPattern.example;

public class WoodenTable implements Table {

    @Override
    public void creatingTable() {
        System.out.println("creating wooden table");
    }
}
