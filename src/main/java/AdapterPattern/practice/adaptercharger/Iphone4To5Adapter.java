package AdapterPattern.practice.adaptercharger;


import AdapterPattern.practice.charger.AdapterCharger;
import AdapterPattern.practice.charger.Charger;
import AdapterPattern.practice.charger.Iphone4sCharger;

public class Iphone4To5Adapter implements AdapterCharger {

    private final Iphone4sCharger iphone4sCharger;

    public Iphone4To5Adapter() {
        this.iphone4sCharger = new Iphone4sCharger();
    }

    public Iphone4To5Adapter(Iphone4sCharger iphone4sCharger) {
        this.iphone4sCharger = iphone4sCharger;
    }

    @Override
    public void charge() {
        System.out.println("------Using Iphone4To5Adapter charger-----");
        adapt(iphone4sCharger);
        iphone4sCharger.charge();
    }

    @Override
    public void adapt(Charger charger) {
        System.out.println("adapting");
        if (!charger.adaptable()) {
            System.out.println("Charger can't be adapted");
            throw new IllegalStateException("Charger can't be adapted. Stop");
        }
    }

    @Override
    public boolean adaptable() {
        return false;
    }
}
