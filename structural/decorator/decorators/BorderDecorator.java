package structural.decorator.decorators;

import structural.decorator.components.Component;

public class BorderDecorator extends Decorator {
    private final double borderWidth;

    public BorderDecorator(Component component, double borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    @Override
    public void render() {
        super.render();
        this.drawBorder();
    }

    private void drawBorder() {
        System.out.printf("border of width %f rendered.\n", this.borderWidth);
    }
}
