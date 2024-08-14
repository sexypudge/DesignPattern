package AbstractFactoryPattern.example;

public class FurnitureFactory {
    private FurnitureFactory() {
    }

    public static FurnitureAbstractFactory getFactory(Type type){
        switch (type){
            case IRON:{

            }
            case WOODEN:{
                return new WoodenFactory();
            }
            default:{
                return null;
            }
        }
    }

}
