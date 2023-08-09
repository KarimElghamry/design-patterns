package behavioral.chain_of_responsibility.handlers;

// can implement a widget interface
// cut down for simplicity
public class Button implements HelpHandler {
    private final HelpHandler nextHelpHandler;
    private final String tooltip;

    public Button(HelpHandler nextHelpHandler, String tooltip) {
        this.nextHelpHandler = nextHelpHandler;
        this.tooltip = tooltip;
    }

    @Override
    public void showHelp() {
        if (tooltip != null) {
            System.out.printf("button help: %s\n", this.tooltip);
            return;
        }

        this.nextHelpHandler.showHelp();
    }

}
