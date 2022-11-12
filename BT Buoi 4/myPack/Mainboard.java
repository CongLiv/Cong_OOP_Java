package myPack;

import java.util.Scanner;

public class Mainboard {
    private String id;
    private String name;
    private Brand brand;

    public Mainboard(String id, String name, Brand brand) {
        this.id = id;
        this.name = name;
        this.brand = brand;
    }
    public Brand getBrand() {
        return brand;
    }
    public void setBrand(Brand brand) {
        this.brand = brand;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap id Mainboard:");
        setId(scan.nextLine());
        System.out.println("Nhap ten Mainboard: ");
        setName(scan.nextLine());
    }
    public Mainboard() {
    }
    
    
}
