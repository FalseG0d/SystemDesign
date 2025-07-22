package Structural.Proxy;

public class RealImage implements Image{
    String path;

    RealImage(String path) {
        this.path = path;
    }

    @Override
    public void loadImage() {
        System.out.println("Loading Image: " + this.path);
    }

    @Override
    public void showImage() {
        System.out.println("Showing Image: " + this.path);
    }
}
