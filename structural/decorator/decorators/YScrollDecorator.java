package structural.decorator.decorators;

import structural.decorator.components.Component;

public class YScrollDecorator extends Decorator {
    private double scrollPosition;

    public YScrollDecorator(Component component) {
        super(component);
        this.scrollPosition = 0;
    }

    public void scrollTo(double scrollPosition) {
        this.scrollPosition = scrollPosition;
        System.out.printf("scrolled to %f.\n", this.scrollPosition);
    }
}
