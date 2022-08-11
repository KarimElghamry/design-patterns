package structural.decorator;

import structural.decorator.components.Component;
import structural.decorator.components.TextView;
import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.YScrollDecorator;

public class Client {
    public static void main(String[] args) {
        Component textView = new TextView();
        // add border to textView
        textView = new BorderDecorator(textView, 10);
        // add scroll functionality to text view
        textView = new YScrollDecorator(textView);

        // render the component, unaware of added decorators
        textView.render();

        // invoke decorator specific behaviour
        YScrollDecorator.class.cast(textView).scrollTo(200);
    }
}
