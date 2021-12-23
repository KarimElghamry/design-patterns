package structural.adapter.shapes;

// this is the target interface that the client will commit to

public interface Shape {
    public double getArea();

    public void draw();

    public void move();
}