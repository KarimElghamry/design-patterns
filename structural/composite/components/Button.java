package structural.composite.components;

// a premitive component
public class Button implements Component {
    private final String name;

    public Button(String name) {
        this.name = name;
    }

    public void build() {
        System.out.printf("%s built.\n", this.name);
    }
}
