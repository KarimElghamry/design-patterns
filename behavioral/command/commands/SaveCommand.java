package behavioral.command.commands;

public class SaveCommand implements Command {
    private final String message;

    public SaveCommand(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.printf("saving: %s\n", this.message);
    }
}
