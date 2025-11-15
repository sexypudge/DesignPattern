package AdapterPattern.practice.adaptercharger;

import AdapterPattern.practice.charger.AdapterCharger;
import AdapterPattern.practice.charger.Charger;

public class GeneralAdapterCharger implements AdapterCharger {
    private final Charger charger;

    public GeneralAdapterCharger(Charger charger) {
        this.charger = charger;
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
    public void charge() {
        System.out.println("------Using General Adapter charger-----");
        System.out.println("type of charger: " + charger.getClass().getName());
        adapt(charger);
        charger.charge();
    }

    @Override
    public boolean adaptable() {
        return false;
    }
}
