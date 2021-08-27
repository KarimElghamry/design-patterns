package creational.abstract_factory.material;

import creational.abstract_factory.WidgetFactory;
import creational.abstract_factory.widgets.Color;

public class MaterialWidgetFactory implements WidgetFactory {
    public MaterialButton createButton() {
        return new MaterialButton();
    }

    public MaterialTextField createTextField() {
        return new MaterialTextField();
    }

    public MaterialIcon createIcon() {
        return new MaterialIcon(Color.DARK);
    }
}
