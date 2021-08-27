package creational.abstract_factory.material;

import creational.abstract_factory.widgets.Button;

class MaterialButton implements Button {
    public void click() {
        System.out.println("Material button clicked");
    };
}
