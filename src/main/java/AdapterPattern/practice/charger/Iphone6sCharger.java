package AdapterPattern.practice.charger;

public class Iphone6sCharger implements Charger {
    @Override
    public void charge() {
        System.out.println("Iphone6sCharger is charging");
    }

    @Override
    public boolean adaptable() {
        return false;
    }
}
