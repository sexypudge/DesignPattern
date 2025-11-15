package AdapterPattern.practice.charger;

public class Iphone4sCharger implements Charger {

    @Override
    public void charge() {
        System.out.println("Iphone4sCharger is charging");
    }

    @Override
    public boolean adaptable() {
        return true;
    }
}
