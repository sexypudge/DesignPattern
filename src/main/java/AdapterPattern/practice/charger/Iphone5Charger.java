package AdapterPattern.practice.charger;

public class Iphone5Charger implements Charger, Adaptable {

    @Override
    public void charge() {
        System.out.println("Iphone5Charger is charging");
    }

    @Override
    public boolean adaptable() {
        return false;
    }
}
