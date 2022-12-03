package myPack;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    static private List<Book> cart = new ArrayList<Book>();

    private Cart(){

    }

    public static List<Book> getInstance(){
        return cart;
    }

    public static void addToCart(int id, int soluong)
    {
        if (Inventory.checkValid(id)) {
            Book tmp = Inventory.getBook(id);
            if (soluong > tmp.getStock()) {System.out.println("Khong du so duong sach!"); return;}
       
            while (tmp.getStock() >= soluong && soluong != 0)
            {
                soluong--;
                tmp.setStock(tmp.getStock() - 1);
            }
        }
    }
}
