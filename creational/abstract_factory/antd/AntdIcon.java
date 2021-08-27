package creational.abstract_factory.antd;

import creational.abstract_factory.widgets.Color;
import creational.abstract_factory.widgets.Icon;

class AntdIcon implements Icon {
    private Color color;

    public AntdIcon(Color color) {
        this.color = color;
    }

    public void changeColor(Color color) {
        this.color = color;
        System.out.println(String.format("Antd icon color is %s", this.color));
    }
}
