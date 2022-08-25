package structural.facade;

import structural.facade.components.VirtualMachine;

public class Client {
    public static void main(String[] args) {
        // create virutal machine
        VirtualMachine vm = new VirtualMachine();
        vm.startUp();
        vm.shutdown();
    }
}
