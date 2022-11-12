package myPack;

import java.util.Scanner;

public class Brand {

    private String name;
    private RAM ram;
    private CPU cpu;
    private Mainboard mainboard;

    Scanner scan = new Scanner(System.in);
    
    public Brand(String name, RAM ram, CPU cpu, Mainboard mainboard) {
        this.name = name;
        this.ram = ram;
        this.cpu = cpu;
        this.mainboard = mainboard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
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
    
    public void input(){
        System.out.println("Nhap ten Brand: ");
        setName(scan.nextLine());
    }

    public Brand() {
    }

    
}
