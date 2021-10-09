package creational.prototype.ui;

public class Circle implements Shape {
    private final Float radius;
    private String color;

    public Circle(Float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    protected Circle(Circle instance) {
        this.radius = instance.radius;
        this.color = instance.color;
    }

    public Float area() {
        return Double.valueOf(Math.PI).floatValue() * this.radius * this.radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Shape clone() {
        return new Circle(this);
    }
}
