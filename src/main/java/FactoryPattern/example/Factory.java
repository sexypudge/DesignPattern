package FactoryPattern.example;

public class Factory {
    private Factory() {

    }
    public static Music getMusic(Type type){
        switch (type) {
            case POP:{
                return new Pop();
            }
            case EDM:{
                return new EDM();
            }
            default:{
                return null;
            }
        }
    }
}
