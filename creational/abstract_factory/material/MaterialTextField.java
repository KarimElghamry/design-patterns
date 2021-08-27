package creational.abstract_factory.material;

import creational.abstract_factory.widgets.TextField;

class MaterialTextField implements TextField {
    private String text;

    public MaterialTextField() {
        this.text = "";
    }

    public void erase() {
        System.out.println("Material textfield erased");
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
