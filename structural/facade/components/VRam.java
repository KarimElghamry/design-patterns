package structural.facade.components;

class VRam {
    public void init() {
        System.out.println("RAM initialized.");
    }

    public void set(byte[] data, int location) {
        System.out.println("data saved.");
    }

    public byte[] get(int location) {
        // logic to retrieve data
        return "data".getBytes();
    }

    public void dispose() {
        System.out.println("RAM disposed.");
    }

}
