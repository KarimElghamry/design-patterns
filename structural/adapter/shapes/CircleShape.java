package structural.adapter.shapes;

import structural.adapter.mui.MuiCircle;

// this is the adapter class that adapts the MuiCircle class
// to comform to the Shape Interface
public class CircleShape extends MuiCircle implements Shape {

    public CircleShape(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        final double radius = super.getRadius();
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        final double xCoor = super.getXCoor();
        final double yCoor = super.getYCoor();
        // mechanism to draw

        System.out.printf("x Coor: %f\n", xCoor);
        System.out.printf("y Coor: %f\n", yCoor);
    }

    @Override
    public void move() {
        // mechanism to move
        System.out.println("moved");
    }
}
