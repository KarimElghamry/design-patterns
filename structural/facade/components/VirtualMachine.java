package structural.facade.components;

public class VirtualMachine {
    final VCpu cpu;
    final VRam ram;
    final Disk disk;
    public String state;

    public VirtualMachine() {
        // these can be injected through the constructor
        // to decouple implementation.
        this.cpu = new VCpu();
        this.ram = new VRam();
        this.disk = new Disk();

        this.state = "SHUTDOWN";
    }

    public void startUp() {
        this.state = "POWERED_ON";

        this.cpu.init();
        this.ram.init();
        this.disk.init();
    }

    public void sleep() {
        this.state = "SLEEP";
    }

    public void shutdown() {
        this.state = "SHUTDOWN";

        this.cpu.dispose();
        this.ram.dispose();
        this.disk.dispose();
    }
}
