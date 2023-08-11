package behavioral.command.widgets;

import behavioral.command.commands.Command;

public class Button implements Widget {

    private final Command onClick;

    public Button(Command onClick) {
        this.onClick = onClick;
    }

    @Override
    public void click() {
        this.onClick.execute();
    }

}
