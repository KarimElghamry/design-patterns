package structural.proxy.graphics;

public class Image implements Graphic {
    private final Dimensions dimensions;

    public Image(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public void draw() {
        System.out.println("Drawing image ...");
    }

    @Override
    public Dimensions getDimensions() {
        return this.dimensions;
    }

}
