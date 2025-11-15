package practices.adapter;

public class Iphone6ChargerAdapter implements Charger {
    private final Charger charger;

    public Iphone6ChargerAdapter(Charger charger) {
        this.charger = charger;
    }

    @Override
    public void charge() {
        charger.charge();
    }
}
