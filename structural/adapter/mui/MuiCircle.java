package structural.adapter.mui;

// this is the concrete class (adaptee) that we want to adapt
// it's functionality into our target interface

public class MuiCircle {
    final double radius;
    double xCoor;
    double YCoor;

    public MuiCircle(double radius) {
        this.radius = radius;
        this.xCoor = 0;
        this.YCoor = 0;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getXCoor() {
        return this.xCoor;
    }

    public double getYCoor() {
        return this.YCoor;
    }
}
