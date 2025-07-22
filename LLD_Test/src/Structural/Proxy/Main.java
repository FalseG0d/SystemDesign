package Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("example.jpg");

        proxyImage.loadImage();
        proxyImage.showImage();
    }
}
