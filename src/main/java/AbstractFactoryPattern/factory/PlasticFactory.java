package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.product.chair.Chair;
import AbstractFactoryPattern.product.chair.PlasticChair;
import AbstractFactoryPattern.product.table.PlasticTable;
import AbstractFactoryPattern.product.table.Table;

public class PlasticFactory extends FurnitureAbstractFactory {
    public Chair createChair() {
        return new PlasticChair();
    }

    public Table createTable() {
        return new PlasticTable();
    }
}
