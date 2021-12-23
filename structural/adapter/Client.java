package structural.adapter;

import structural.adapter.shapes.CircleShape;
import structural.adapter.shapes.Shape;

class Client {
    public static void main(String[] args) {
        // initializing the adapter
        final Shape circle = new CircleShape(5.0);

        System.out.printf("area: %f\n", circle.getArea());
        circle.draw();
        circle.move();
    }
}
