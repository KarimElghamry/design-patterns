package creational.builder.canvas;

public class StandardCanvasBuilder implements CanvasBuilder {

    private Integer width;
    private Integer height;
    private Float rotation;
    private String backgroundColor;
    private String borderColor;
    private String borderType;

    public CanvasBuilder width(Integer width) {
        this.width = width;
        return this;
    }

    public CanvasBuilder height(Integer height) {
        this.height = height;
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
