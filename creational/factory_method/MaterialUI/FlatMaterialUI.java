package creational.factory_method.MaterialUI;

import creational.factory_method.Button.Button;
import creational.factory_method.Button.FlatButton;

public class FlatMaterialUI extends AbstractMaterialUI {
    public FlatMaterialUI(String theme) {
        super(theme);
    }

    // override factory method to return a flat button
    @Override
    public Button createButton() {
        return new FlatButton();
    }
}
