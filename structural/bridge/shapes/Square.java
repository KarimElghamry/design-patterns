package structural.bridge.shapes;

import structural.bridge.colors.Color;

public class Square implements Shape {
    public final float length;
    private final Color color;

    public Square(float length, Color color) {
        this.length = length;
        this.color = color;
    }

    @Override
    public float getArea() {
        return this.length * this.length;
    }

    @Override
    public void draw() {
        // drawing logic using this.color
        this.color.getHex();
    }
}
