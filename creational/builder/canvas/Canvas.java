package creational.builder.canvas;

public class Canvas {
    private final Integer width;
    private final Integer height;
    private final Float rotation;
    private final String backgroundColor;
    private final String borderColor;
    private final String borderType;

    public Canvas(Integer width, Integer height, Float rotation, String backgroundColor, String borderColor,
            String borderType) {
        this.width = width;
        this.height = height;
        this.rotation = rotation;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.borderType = borderType;
    }

    public Integer getWidth() {
        return this.width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public Float getRotation() {
        return this.rotation;
    }

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public String getBorderColor() {
        return this.borderColor;
    }

    public String getBorderType() {
        return this.borderType;
    }
}
