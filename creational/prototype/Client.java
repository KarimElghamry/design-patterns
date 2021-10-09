package creational.prototype;

import creational.prototype.ui.Circle;
import creational.prototype.ui.Rectangle;
import creational.prototype.ui.Shape;

public class Client {
    public static void main(String[] args) {
        // create a circle and a square
        Shape originalCircle = new Circle(20f, "BLACK");
        Shape originalRectangle = new Rectangle(5f, 10f, "WHITE");

        originalCircle.setColor("BLUE");
        originalRectangle.setColor("RED");

        // copy shapes
        Shape circleCopy = originalCircle.clone();
        Shape rectangleCopy = originalRectangle.clone();

        System.out.println(originalCircle.area().compareTo(circleCopy.area()) == 0);
        System.out.println(originalRectangle.area().compareTo(rectangleCopy.area()) == 0);
    }
}
