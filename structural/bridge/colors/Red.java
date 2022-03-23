package structural.bridge.colors;

public class Red implements Color {
    private final String hexValue;
    @SuppressWarnings("unused")
    private float opacity; // range from 0 to 1

    public Red(float opacity) {
        this.hexValue = "FF0000";
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
