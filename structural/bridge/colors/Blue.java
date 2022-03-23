package structural.bridge.colors;

public class Blue implements Color {
    private final String hexValue;
    @SuppressWarnings("unused")
    private float opacity; // range from 0 to 1

    Blue(float opacity) {
        this.hexValue = "0000FF";
        this.opacity = opacity;
    }

    @Override
    public String getHex() {
        return this.hexValue;
    }

    @Override
    public void setOpacity(float opacity) {
        this.opacity = opacity;
    }

}
