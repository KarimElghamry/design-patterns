package creational.builder.canvas;

/**
 * An implementation of CanvasBuilder that enforces a certain padding on the
 * width and height of the canvas
 */

public class PaddedCanvasBuilder implements CanvasBuilder {

    private Integer width;
    private Integer height;
    private final Integer padding;
    private Float rotation;
    private String backgroundColor;
    private String borderColor;
    private String borderType;

    public PaddedCanvasBuilder(Integer padding) {
        this.padding = padding;
    }

    public CanvasBuilder width(Integer width) {
        this.width = width + (2 * this.padding);
        return this;
    }

    public CanvasBuilder height(Integer height) {
        this.height = height + (2 * this.padding);
        return this;
    }

    public CanvasBuilder rotation(Float deg) {
        this.rotation = deg;
        return this;
    }

    public CanvasBuilder backgroundColor(String color) {
        this.backgroundColor = color;
        return this;
    }

    public CanvasBuilder borderType(String type) {
        this.borderType = type;
        return this;
    }

    public CanvasBuilder borderColor(String color) {
        this.borderColor = color;
        return this;
    }

    public Canvas build() {
        return new Canvas(width, height, rotation, backgroundColor, borderColor, borderType);
    }
}
