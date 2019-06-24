package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.product.chair.Chair;
import AbstractFactoryPattern.product.table.Table;

public abstract class FurnitureAbstractFactory {

    public abstract Chair createChair();

    public abstract Table createTable();
}
