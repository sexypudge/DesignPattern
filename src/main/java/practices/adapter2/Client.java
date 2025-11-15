package practices.adapter2;

public class Client {
    public void main(String[] args) {
        Iphone iphone4 = new Iphone4();
        iphone4.iphoneCharge();

        Iphone adapter = new SamsungAdapter(new GalaxyA52());
        adapter.iphoneCharge();

    }
}
