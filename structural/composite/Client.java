package structural.composite;

import structural.composite.components.Button;
import structural.composite.components.Component;
import structural.composite.components.Grid;
import structural.composite.components.Text;

public class Client {
    public static void main(String[] args) {
        // left sub tree
        final Component headerText = new Text("Header Text");

        // right sub tree
        final Component informationText = new Text("Information Text");
        final Component confirmButton = new Button("Confirm Button");
        final Grid bodyGrid = new Grid("Body Grid");
        bodyGrid.add(informationText)
                .add(confirmButton);

        // root
        final Grid appGrid = new Grid("App Grid");
        appGrid.add(headerText)
                .add(bodyGrid);

        // build component tree recursively
        appGrid.build();
    }
}