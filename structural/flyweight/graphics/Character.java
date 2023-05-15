package structural.flyweight.graphics;

// Flyweight
class Character implements Graphic {
    // c is intrinsic state
    private final String c;

    Character(String c) {
        this.c = c;
    }

    // x and y are extrinsic states
    @Override
    public void Draw(int x, int y) {
        // drawing logic
        System.out.printf("drawing %s on x: %d and y: %d \n", this.c, x, y);
    }
}
