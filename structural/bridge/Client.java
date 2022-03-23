package structural.bridge;

import structural.bridge.colors.Color;
import structural.bridge.colors.Red;
import structural.bridge.shapes.Circle;
import structural.bridge.shapes.Shape;

public class Client {
    public static void main(String[] args) {
        // inject color implementation into the shape object
        // that way, we can implement any variant of the Color class
        // without changing the interface or the implementation of the
        // shape interface or subclasses
        Color color = new Red(0.5f);
        Shape circle = new Circle(2f, color);

        circle.draw();
    }

}
