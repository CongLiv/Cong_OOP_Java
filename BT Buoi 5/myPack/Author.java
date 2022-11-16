package myPack;

import java.util.ArrayList;

public class Author {
    private String name = "Unknown";
    private ArrayList<Book> books;

    
    public ArrayList<Book> getBooks() {
        return books;
    }
    public Author() {
    }
    public Author(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void addBook(Book book)
    {
        books.add(book);
    }

    public void getAuthorInfo()
    {
        System.out.println("Ten tac gia: " + getName());
        System.out.println("Sach sang tac: ");
        for (Book x : getBooks()) System.out.println(x.getName());
    }

    
}
