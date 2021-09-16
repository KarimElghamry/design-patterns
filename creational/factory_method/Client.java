package creational.factory_method;

import creational.factory_method.Button.Button;
import creational.factory_method.MaterialUI.AbstractMaterialUI;
import creational.factory_method.MaterialUI.ElevatedMaterialUI;
import creational.factory_method.MaterialUI.FlatMaterialUI;

public class Client {
    public static void main(String[] args) {
        AbstractMaterialUI ui = new FlatMaterialUI("DARK");
        System.out.println(String.format("ui type: %s", ui.getType()));

        // get Button through factory
        // this will be a FlatButton
        Button btn = ui.createButton();
        btn.click();

        // change MaterialUI to elevated
        ui = new ElevatedMaterialUI("LIGHT");
        System.out.println(String.format("ui type: %s", ui.getType()));

        // get Button through factory
        // this will be an ElevatedButton
        btn = ui.createButton();
        btn.click();
    }
}
