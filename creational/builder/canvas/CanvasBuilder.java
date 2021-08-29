package creational.builder.canvas;

/**
 * a contract used by the director to build custom Canvas's
 */
public interface CanvasBuilder {
    public CanvasBuilder width(Integer width);

    public CanvasBuilder height(Integer height);

    public CanvasBuilder rotation(Float deg);

    public CanvasBuilder backgroundColor(String color);

    public CanvasBuilder borderType(String type);

    public CanvasBuilder borderColor(String color);

    public Canvas build();
}
