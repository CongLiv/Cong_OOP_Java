package myPack;

import java.util.Scanner;

public class RAM {
    private String id;
    private String name;
    private Brand brand;

    public RAM(String id, String name, Brand brand) {
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

    public RAM() {
    }

    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.println("Nhap id RAM:");
        setId(scan.nextLine());
        System.out.println("Nhap ten RAM: ");
        setName(scan.nextLine());
    }
    
    
}
