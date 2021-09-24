package creational.singleton;

class Client {
    public static void main(String[] args) {
        // we'll get an instance from the store
        // and set the two states to arbitrary strings
        Store firstStore = Store.instance();
        firstStore.setState1("BLUE");
        firstStore.setState2("RED");

        // we'll get an instance from the store again
        // but this time, it should be the same instance as before
        // and the states should preserve
        Store secondStore = Store.instance();
        System.out.println(secondStore.getState1());
        System.out.println(secondStore.getState2());

        // both variables should contain the same reference to the store
        System.out.println(firstStore == secondStore);
    }
}
