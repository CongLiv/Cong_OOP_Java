package myPack;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    static private List<Book> listBooks = new ArrayList<Book>();
    private Inventory(){}

    static public List<Book> getInstance(){
        return listBooks;
    }

    static public void addToInventory(Book book){
        listBooks.add(book);
    }

    static public boolean checkValid(int id)
    {
        for (Book book : listBooks)
        {
            if (book.getId() == id) return true;
        }

        return false;
    }

    static public Book getBook(int id)
    {
        for (Book book : listBooks)
        {
            if (book.getId() == id) {
                return book;
            }
        }
        return new Book();
    }

}
