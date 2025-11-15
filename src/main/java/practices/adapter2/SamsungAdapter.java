package practices.adapter2;

public class SamsungAdapter implements Iphone {

    private final Samsung samsung;

    public SamsungAdapter(Samsung samsung) {
        this.samsung = samsung;
    }

    @Override
    public void iphoneCharge() {
        samsung.samsungCharge();
    }
}
