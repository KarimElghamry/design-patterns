package creational.builder;

import creational.builder.canvas.Canvas;
import creational.builder.canvas.CanvasBuilder;

public class Window {
    private Canvas canvas;

    public void createPlainCanvas(CanvasBuilder builder) {
        this.canvas = builder.width(200).height(200).rotation(0f).backgroundColor("White").borderType("Solid")
                .borderColor("Black").build();
    }

    public void createFunkyCanvas(CanvasBuilder builder) {
        this.canvas = builder.width(1000).height(300).rotation(420f).backgroundColor("Purple").borderType("Dotted")
                .borderColor("Pink").build();
    }

    public String describeCanvas() {
        return String.format("%dx%d %s canvas", canvas.getWidth(), canvas.getHeight(), canvas.getBackgroundColor());
    }
}
