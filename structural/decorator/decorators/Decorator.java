package structural.decorator.decorators;

import structural.decorator.components.Component;

public abstract class Decorator implements Component {
    private final Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void render() {
        this.component.render();
    }
}
