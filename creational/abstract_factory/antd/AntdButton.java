package creational.abstract_factory.antd;

import creational.abstract_factory.widgets.Button;

class AntdButton implements Button {
    public void click() {
        System.out.println("Antd button clicked");
    };
}
