package creational.abstract_factory;

import creational.abstract_factory.material.MaterialWidgetFactory;
import creational.abstract_factory.widgets.Button;
import creational.abstract_factory.widgets.Color;
import creational.abstract_factory.widgets.Icon;
import creational.abstract_factory.widgets.TextField;

public class Client {
    public static void main(String[] args) {
        // we'll create a set of material widget
        // if we ever want to change from material to antd
        // we'll only have to change the concrete class
        // from MaterialWidgetFactory -> AntdWidgetFactory
        WidgetFactory factory = new MaterialWidgetFactory();
        Button button = factory.createButton();
        Icon icon = factory.createIcon();
        TextField textField = factory.createTextField();

        button.click();
        icon.changeColor(Color.WHITE);
        textField.setText("This is a text field");
        System.out.println(textField.getText());
        /* ........ */
    }
}
