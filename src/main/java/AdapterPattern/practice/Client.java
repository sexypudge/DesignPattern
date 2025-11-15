//package AdapterPattern.practice;
//
//import AdapterPattern.practice.adaptercharger.GeneralAdapterCharger;
//import AdapterPattern.practice.adaptercharger.IPhone4sTo6sAdapter;
//import AdapterPattern.practice.adaptercharger.Iphone4To5Adapter;
//import AdapterPattern.practice.charger.Charger;
//import AdapterPattern.practice.charger.Iphone4sCharger;
//import AdapterPattern.practice.charger.Iphone5Charger;
//import AdapterPattern.practice.charger.Iphone6sCharger;
//import AdapterPattern.practice.iphone.IPhone;
//import AdapterPattern.practice.iphone.Iphone4;
//import AdapterPattern.practice.iphone.Iphone5;
//import AdapterPattern.practice.iphone.Iphone6s;
//
//public class Client {
//
//    public static void main(String[] args) {
//        Iphone4sCharger iphone4sCharger = new Iphone4sCharger();
//
//        IPhone iphone4 = new Iphone4(iphone4sCharger);
//        iphone4.onCharge();
//
//        IPhone iphone6sOK = new Iphone6s(new IPhone4sTo6sAdapter(iphone4sCharger));
//        iphone6sOK.onCharge();
//
//        IPhone iphone6s = new Iphone6s(new GeneralAdapterCharger(iphone4sCharger));
//        iphone6s.onCharge();
//
//        IPhone iphone6sNotOK = new Iphone6s(new GeneralAdapterCharger(new Iphone5Charger()));
//        iphone6sNotOK.onCharge();
//
////        IPhone iphone51 = new Iphone5(new GeneralAdapterCharger(iphone4sCharger));
////        iphone51.onCharge();
////
////        IPhone iphone52 = new Iphone5(new GeneralAdapterCharger(new Iphone6sCharger()));
////        iphone52.onCharge();
//
////        IPhone iphone5 = new Iphone5(new Iphone4To5Adapter(iphone4sCharger));
////        iphone5.onCharge();
//    }
//}
