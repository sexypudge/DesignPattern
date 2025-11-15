package Proxy.virtualProxy1;

public class Client {
    public void main(String[] args) {
        System.out.println("Init proxy Image");
        Image proxyImage = new ProxyImage("http://gpcoder.com/favicon.ico");
        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();

    }
}
