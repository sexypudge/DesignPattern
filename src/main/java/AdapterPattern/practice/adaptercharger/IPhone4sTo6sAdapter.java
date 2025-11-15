package AdapterPattern.practice.adaptercharger;

import AdapterPattern.practice.charger.AdapterCharger;
import AdapterPattern.practice.charger.Charger;
import AdapterPattern.practice.charger.Iphone4sCharger;

public class IPhone4sTo6sAdapter implements AdapterCharger {
    private final Iphone4sCharger iphone4sCharger;

    public IPhone4sTo6sAdapter() {
        this.iphone4sCharger = new Iphone4sCharger();
    }

    public IPhone4sTo6sAdapter(Iphone4sCharger charger) {
        this.iphone4sCharger = charger;
    }

    @Override
    public void charge() {
        System.out.println("------Using IPhone4sTo6sAdapter charger-----");
        adapt(iphone4sCharger);
        iphone4sCharger.charge();
    }

    @Override
    public void adapt(Charger charger) {
        System.out.println("adapting");
        if (!charger.adaptable())  {
            System.out.println("Charger can't be adapted");
            throw new IllegalStateException("Charger can't be adapted. Stop");
        }
    }

    @Override
    public boolean adaptable() {
        return false;
    }
}
