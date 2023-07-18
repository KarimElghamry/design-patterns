package structural.proxy;

import structural.proxy.graphics.Dimensions;
import structural.proxy.graphics.Graphic;
import structural.proxy.graphics.ImageProxy;

public class Client {
    public static void main(String[] args) {
        Dimensions imageDimensions = new Dimensions(10, 15);
        Graphic image = new ImageProxy(imageDimensions);

        // doesn't instaniate image
        image.getDimensions();

        // instaniates image on demand
        image.draw();
    }
}
