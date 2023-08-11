package behavioral.command.commands;

public class PrintCommand implements Command {
    private final String header;

    public PrintCommand(String header) {
        this.header = header;
    }

    @Override
    public void execute() {
        System.out.printf("printing with header: %s\n", this.header);
    }
}
