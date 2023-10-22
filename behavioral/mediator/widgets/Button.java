package behavioral.mediator.widgets;

public class Button extends Widget {
    private boolean isEnabled;

    public Button(Mediator dialog) {
        super(dialog);
        this.isEnabled = false;
    }

    public void click() {
        this.dialog.notfiy(this, "click");
    }

    public void trigger(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

}
