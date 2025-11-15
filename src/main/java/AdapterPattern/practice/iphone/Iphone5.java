package AdapterPattern.practice.iphone;

import AdapterPattern.practice.charger.AdapterCharger;
import AdapterPattern.practice.charger.Iphone5Charger;

public class Iphone5 implements IPhone {
    private AdapterCharger adapterCharger;
    private Iphone5Charger charger;

    public Iphone5(Iphone5Charger charger) {
        this.charger = charger;
    }

    public Iphone5(AdapterCharger charger) {
        this.adapterCharger = charger;
    }

    @Override
    public void onCharge() {
        System.out.println("====================");
        System.out.println("iphone 5 is ready to charge");
        if (charger != null) {
            charger.charge();
        } else {
            if (adapterCharger != null) {
                adapterCharger.charge();
            } else {
                throw new IllegalStateException("not found suitable charger, can't charge");
            }
        }

        System.out.println("iphone 5 finished charging");
    }
}
