package structural.facade.components;

class VCpu {
    public void init() {
        System.out.println("CPU initialized.");
    }

    public void compute(String instruction) {
        System.out.println("instruction computed.");
    }

    public void dispose() {
        System.out.println("CPU disposed.");
    }
}
