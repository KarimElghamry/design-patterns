package creational.abstract_factory.antd;

import creational.abstract_factory.WidgetFactory;
import creational.abstract_factory.widgets.Color;

public class AntdWidgetFactory implements WidgetFactory {
    public AntdButton createButton() {
        return new AntdButton();
    }

    public AntdTextField createTextField() {
        return new AntdTextField();
    }

    public AntdIcon createIcon() {
        return new AntdIcon(Color.DARK);
    }
}
