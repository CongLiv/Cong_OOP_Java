package myPack;

public class Book {
    private String author;
    private float price;
    private int stock;
    private int id;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Book(String author, float price, int stock, int id) {
        this.author = author;
        this.price = price;
        this.stock = stock;
        this.id = id;
    }
    public Book() {
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
