package myPack;

import java.util.Scanner;

public class Book {
    private String name;
    private Author author;
    private int status;
    private int stock;
    
    Scanner scan = new Scanner(System.in);

    public Book() {
    }
    public Book(String name, Author author, int status, int stock) {
        this.name = name;
        this.author = author;
        this.status = status;
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setInfo()
    {
        System.out.println("Nhap thong tin sach:");
        System.out.println("Nhap ten sach: ");
        this.name = scan.nextLine();
        System.out.println("Nhap tinh trang sach: ");
        this.status =  Integer.parseInt(scan.nextLine());
        System.out.println("Nhap so luong sach: ");
        this.stock = Integer.parseInt(scan.nextLine());
    }

    public void getInfo()
    {
        System.out.println("Ten sach: " + getName());
        System.out.println("Tac gia: " + author.getName());
        System.out.print("Tinh trang sach: ");
        if (getStatus() == 1) System.out.print("Trong kho\n");
        else if (getStatus() == 2) System.out.print("Trung bay\n");
        else System.out.print("Da cho muon\n");
        System.out.println("So luong sach: " + getStock());
    }


}
