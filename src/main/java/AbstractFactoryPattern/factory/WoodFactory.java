package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.product.chair.Chair;
import AbstractFactoryPattern.product.chair.WoodChair;
import AbstractFactoryPattern.product.table.Table;
import AbstractFactoryPattern.product.table.WoodTable;

public class WoodFactory extends FurnitureAbstractFactory {

    public Chair createChair() {
        return new WoodChair();
    }

    public Table createTable() {
        return new WoodTable();
    }
}
