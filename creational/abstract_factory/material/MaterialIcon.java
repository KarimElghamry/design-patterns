package creational.abstract_factory.material;

import creational.abstract_factory.widgets.Color;
import creational.abstract_factory.widgets.Icon;

class MaterialIcon implements Icon {
    private Color color;

    public MaterialIcon(Color color) {
        this.color = color;
    }

    public void changeColor(Color color) {
        this.color = color;
        System.out.println(String.format("material icon color is %s", this.color));
    }
}
