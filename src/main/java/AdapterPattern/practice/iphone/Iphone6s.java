package AdapterPattern.practice.iphone;

import AdapterPattern.practice.charger.AdapterCharger;
import AdapterPattern.practice.charger.Charger;
import AdapterPattern.practice.charger.Iphone6sCharger;

public class Iphone6s implements IPhone {

//    private final AdapterCharger adapterCharger;
    private final Charger charger;

    public Iphone6s(Charger charger) {
        this.charger = charger;
    }

//    public Iphone6s(AdapterCharger charger) {
//        this.adapterCharger = charger;
//    }

    @Override
    public void onCharge() {
        System.out.println("====================");
        System.out.println("iphone 6 is ready to charge");
        if (!(charger instanceof Iphone6sCharger) && !(charger instanceof AdapterCharger)) {
            throw new IllegalStateException("not found suitable charger, can't charge");
        }
//        if (adapterCharger != null) {
//            adapterCharger.charge();
//        } else {
//            throw new IllegalStateException("not found suitable charger, can't charge");
//        }
        charger.charge();
        System.out.println("iphone 6 finished charging");
    }
}
