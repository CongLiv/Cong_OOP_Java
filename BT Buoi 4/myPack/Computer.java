package myPack;

public class Computer {
    private String name;
    private Brand brand;
    private CPU cpu;
    private Mainboard mainboard;
    private RAM ram;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public CPU getCpu() {
        return cpu;
    }
    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
    public Mainboard getMainboard() {
        return mainboard;
    }
    public void setMainboard(Mainboard mainboard) {
        this.mainboard = mainboard;
    }
    public RAM getRam() {
        return ram;
    }
    public void setRam(RAM ram) {
        this.ram = ram;
    }
    public Computer() {
    }
    public Computer(String name) {
        this.name = name;
    }
    public Computer(String name, Brand brand, CPU cpu, Mainboard mainboard, RAM ram) {
        this.name = name;
        this.brand = brand;
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.ram = ram;
    }
    public Computer(String name, CPU cpu, Mainboard mainboard, RAM ram) {
        this.name = name;
        this.cpu = cpu;
        this.mainboard = mainboard;
        this.ram = ram;
    }

    public void output()
    {
        System.out.println("Ten may" + getName());
        System.out.println("ID RAM " + getRam().getName() + " : " + (getRam()).getId());
        System.out.println("ID CPU " + getCpu().getName() + " : " + (getCpu()).getId());
        System.out.println("ID Mainboard " + getMainboard().getName() + " : " + (getMainboard()).getId());
    }

    
}
