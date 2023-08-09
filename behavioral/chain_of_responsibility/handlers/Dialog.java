package behavioral.chain_of_responsibility.handlers;

public class Dialog implements HelpHandler {
    private final HelpHandler nextHelpHandler;
    private final String tooltip;

    public Dialog(HelpHandler nextHelpHandler, String tooltip) {
        this.nextHelpHandler = nextHelpHandler;
        this.tooltip = tooltip;
    }

    @Override
    public void showHelp() {
        if (tooltip != null) {
            System.out.printf("dialog help: %s\n", this.tooltip);
            return;
        }

        this.nextHelpHandler.showHelp();
    }

}
