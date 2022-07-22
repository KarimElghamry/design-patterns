package structural.composite.components;

public interface Component {
    // a common method between premitive and composite components
    // to build the UI elements.
    // Premitives: implements the building logic.
    // Composites: delegates the building process to premitive children.
    public void build();
}