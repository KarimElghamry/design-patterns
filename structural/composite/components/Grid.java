package structural.composite.components;

import java.util.ArrayList;
import java.util.List;

// a composite component
public class Grid implements Component {
    private final String name;
    private final List<Component> children;

    public Grid(String name) {
        this.name = name;
        this.children = new ArrayList<Component>();
    }

    // delegate component building to children
    public void build() {
        System.out.printf("building %s ... \n", this.name);
        for (Component component : children) {
            component.build();
        }
        System.out.printf("%s Done.\n", this.name);
    }

    // add component as a child
    public Grid add(Component component) {
        this.children.add(component);
        return this;
    }

    // remove component from children
    public Grid remove(Component component) {
        this.children.remove(component);
        return this;
    }

    public List<Component> getChildren() {
        return this.children;
    }
}
