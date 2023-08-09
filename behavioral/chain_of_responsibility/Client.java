package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.handlers.Button;
import behavioral.chain_of_responsibility.handlers.Dialog;
import behavioral.chain_of_responsibility.handlers.HelpHandler;

public class Client {
    public static void main(String[] args) {
        // first example, showHelp delegated to dialog
        HelpHandler dialog1 = new Dialog(null, "Help from dialog");
        HelpHandler button1 = new Button(dialog1, null);

        button1.showHelp();

        // second example, showHelp fulfilled by button
        HelpHandler dialog2 = new Dialog(button1, "Help from dialog");
        HelpHandler button2 = new Button(dialog2, "Help from button");

        button2.showHelp();
    }
}
