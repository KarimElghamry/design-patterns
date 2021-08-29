package creational.builder;

import creational.builder.canvas.PaddedCanvasBuilder;
import creational.builder.canvas.StandardCanvasBuilder;

public class Client {
    public static void main(String[] args) {
        Window window = new Window();

        // using a standard canvas builder
        StandardCanvasBuilder standardCanvasBuilder = new StandardCanvasBuilder();
        window.createPlainCanvas(standardCanvasBuilder);
        System.out.println(window.describeCanvas());

        window.createFunkyCanvas(standardCanvasBuilder);
        System.out.println(window.describeCanvas());

        // using padded canvas builder
        PaddedCanvasBuilder paddedCanvasBuilder = new PaddedCanvasBuilder(20);
        window.createPlainCanvas(paddedCanvasBuilder);
        System.out.println(window.describeCanvas());

        window.createFunkyCanvas(paddedCanvasBuilder);
        System.out.println(window.describeCanvas());
    }
}
