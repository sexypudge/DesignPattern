package AbstractFactoryPattern;

import AbstractFactoryPattern.factory.FurnitureAbstractFactory;
import AbstractFactoryPattern.factory.FurnitureFactory;
import AbstractFactoryPattern.factory.PlasticFactory;
import AbstractFactoryPattern.product.chair.Chair;

public class MAIN {

    public static void main(String[] args) {

        FurnitureAbstractFactory plasticFactory = FurnitureFactory.getFactory(MaterialType.PLASTIC);
        Chair chair = plasticFactory.createChair();
        chair.create();
    }
}
