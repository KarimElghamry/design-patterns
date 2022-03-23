package structural.bridge.shapes;

import structural.bridge.colors.Color;

public class Circle implements Shape {
    public final float radius;
    private final Color color;

    public Circle(float radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public float getArea() {
        return (float) Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        // drawing logic using this.color
        this.color.getHex();
    }
}
