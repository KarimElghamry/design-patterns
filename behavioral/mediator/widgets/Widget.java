package behavioral.mediator.widgets;

public abstract class Widget {
    protected final Mediator dialog;

    public Widget(Mediator dialog) {
        this.dialog = dialog;
    }
}
