package creational.abstract_factory.antd;

import creational.abstract_factory.widgets.TextField;

class AntdTextField implements TextField {
    private String text;

    public AntdTextField() {
        this.text = "";
    }

    public void erase() {
        System.out.println("Antd textfield erased");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
