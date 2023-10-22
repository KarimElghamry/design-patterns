package behavioral.mediator;

import behavioral.mediator.widgets.UsernameDialog;
import behavioral.mediator.widgets.Mediator;

public class Client {
    public static void main(String[] args) {
        final Mediator dialog = new UsernameDialog();
    }
}
