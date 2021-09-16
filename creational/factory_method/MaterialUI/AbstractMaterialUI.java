package creational.factory_method.MaterialUI;

import creational.factory_method.Button.Button;

public abstract class AbstractMaterialUI {
    private String theme;

    public AbstractMaterialUI(String theme) {
        this.theme = theme;
    }

    // this is the factory method
    // concrete classes should override this method
    // concrete classes should return concrete button implementations
    abstract public Button createButton();

    public void setTheme(String theme) {
        this.theme = theme;
        System.out.println(String.format("Theme set to %s", theme));
    }

    public String getTheme() {
        return this.theme;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }
}
