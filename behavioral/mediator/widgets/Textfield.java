package behavioral.mediator.widgets;

public class Textfield extends Widget {
    private String text;

    public Textfield(Mediator dialog) {
        super(dialog);
        this.text = "";
    }

    public void changeText(String text) {
        this.text = text;
        this.dialog.notfiy(this, "changeText");
    }

    public String getText() {
        return this.text;
    }
}
