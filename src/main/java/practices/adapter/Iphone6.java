package practices.adapter;

public class Iphone6 implements Iphone {
	private final Iphone6ChargerAdapter iphone6ChargerAdapter;

    public Iphone6(Iphone6ChargerAdapter iphone6ChargerAdapter) {
        this.iphone6ChargerAdapter = iphone6ChargerAdapter;
    }

    @Override
    public void onCharge() {
        iphone6ChargerAdapter.charge();
    }
}
