package creational.abstract_factory;

import creational.abstract_factory.widgets.Button;
import creational.abstract_factory.widgets.Icon;
import creational.abstract_factory.widgets.TextField;

public interface WidgetFactory {
    public Button createButton();

    public TextField createTextField();

    public Icon createIcon();
}
