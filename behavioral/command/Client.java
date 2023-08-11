package behavioral.command;

import behavioral.command.commands.Command;
import behavioral.command.commands.PrintCommand;
import behavioral.command.commands.SaveCommand;
import behavioral.command.widgets.Button;
import behavioral.command.widgets.Widget;

public class Client {
    public static void main(String[] args) {
        // create commands
        final Command save = new SaveCommand("hello");
        final Command print = new PrintCommand("Date");

        // create buttons
        final Widget button1 = new Button(save);
        final Widget button2 = new Button(print);

        button1.click();
        button2.click();
    }
}
