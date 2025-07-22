package Structural.Proxy;

public class ProxyImage implements Image{
    String path;
    RealImage realImage;

    ProxyImage(String path) {
        this.path = path;
    }

    @Override
    public void showImage() {
        if(this.realImage == null) {
            this.realImage = new RealImage(this.path);
        }

        this.realImage.showImage();
    }

    @Override
    public void loadImage() {
        if(this.realImage == null) {
            this.realImage = new RealImage(this.path);
        }

        this.realImage.loadImage();
    }
}
