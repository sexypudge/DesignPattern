package practices.adapter;

public class Iphone4 implements Iphone {

	private final Charger charger;

    public Iphone4(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void onCharge() {
        System.out.println("iphone 4 charging");
        charger.charge();
    }
}
