package AdapterPattern.practice.charger;

public interface AdapterCharger extends Charger {
    void adapt(Charger charger);
}
