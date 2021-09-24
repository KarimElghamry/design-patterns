package creational.singleton;

class Store {
    // unique instance across all of the app
    static private Store uniqueInstance;

    // our app state
    private String state1;
    private String state2;

    // make contructor protected to avoid instantiation from outside
    protected Store() {
    }

    // point of instantiation. Should guarantee only one instance.
    static Store instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Store();
        }

        return uniqueInstance;
    }

    // getters & setters
    public String getState1() {
        return this.state1;
    }

    public String getState2() {
        return this.state2;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }
}
