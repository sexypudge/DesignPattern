package AdapterPattern.practice.iphone;

import AdapterPattern.practice.charger.Charger;

public class Iphone4 implements IPhone {
    private final Charger charger;

    public Iphone4(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void onCharge() {
        System.out.println("====================");
        System.out.println("iphone 4 is ready to charge");
        charger.charge();
        System.out.println("iphone 4 finished charging");
    }
}
