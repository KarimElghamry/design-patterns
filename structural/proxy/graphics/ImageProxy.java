package structural.proxy.graphics;

// class to lazy load an image
public class ImageProxy implements Graphic {
    private final Dimensions dimensions;
    private Image image;

    public ImageProxy(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public void draw() {
        if (this.image == null) {
            this.image = new Image(dimensions);
        }

        image.draw();
    }

    @Override
    public Dimensions getDimensions() {
        return this.dimensions;
    }

}
