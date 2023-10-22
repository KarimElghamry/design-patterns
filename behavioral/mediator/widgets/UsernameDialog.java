package behavioral.mediator.widgets;

public class Dialog implements Mediator {
    private final Button button;
    private final Textfield textfield;

    public Dialog() {
        this.button = new Button(this);
        this.textfield = new Textfield(this);

        // simulate component interaction
        // only here for demonstration purposes
        this.button.click();
        this.textfield.changeText("karim");
        this.textfield.changeText(null);
        this.textfield.changeText("karim");
        this.button.click();
    }

    @Override
    public void notfiy(Widget sender, String event) {
        if (sender == this.button && event == "click") {
            // check if user has entered any text
            final String text = this.textfield.getText();
            if (text == "" || text == null)
                System.out.println("button disabled: please enter username.");
            else
                System.out.printf("username is: %s\n", text);
        }

        if (sender == this.textfield || event == "changedText") {
            // check if the textfield is empty and enable/disable
            // button accordingly
            final String text = this.textfield.getText();
            if (text == "" || text == null) {
                System.out.println("textfield is empty: disabling button.");
                this.button.trigger(false);
            } else {
                System.out.println("textfiled is populated: enabling button.");
                this.button.trigger(true);
            }
        }
    }

}
