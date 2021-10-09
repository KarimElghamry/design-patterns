package creational.prototype.ui;

public class Rectangle implements Shape {
    private final Float width;
    private final Float height;
    private String color;

    public Rectangle(Float width, Float height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    protected Rectangle(Rectangle instance) {
        this.width = instance.width;
        this.height = instance.height;
        this.color = instance.color;
    }

    public Float area() {
        return this.width * this.height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape clone() {
        return new Rectangle(this);
    }
}
