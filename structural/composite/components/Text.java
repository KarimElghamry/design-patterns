package structural.composite.components;

// premitive component
public class Text implements Component {
    private final String name;

    public Text(String name) {
        this.name = name;
    }

    public void build() {
        System.out.printf("%s built.\n", this.name);
    }
}
