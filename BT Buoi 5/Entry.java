import java.util.ArrayList;
import java.util.Scanner;

import myPack.*;

public class Entry {
    
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[])
    {
        ArrayList<Book> books = new ArrayList<Book>();
        ArrayList<Author> authors = new ArrayList<Author>();
        System.out.println("Nhap so luong sach: ");
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            Book tmpBook = new Book();
            tmpBook.setInfo();
            books.add(tmpBook);
        }

        System.out.println("Nhap so luong tac gia: ");
        int m = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < m; i++)
        {
            Author tmpAuthor = new Author();
            System.out.println("Nhap ten tac gia: ");
            String s = scan.nextLine();
            tmpAuthor.setName(s);
            System.out.print("Nhap so luong sach sang tac: ");
            int k = Integer.parseInt(scan.nextLine());
            for (int j = 0; j < k; j++)
            {
                System.out.print("Nhap ten sach thu " + (j + 1) + " : ");
                String bookName = scan.nextLine();
                for (Book x : books) {
                    if (x.getName().equals(bookName))
                    {
                        tmpAuthor.addBook(x);
                        break;
                    }
                }
            }

            authors.add(tmpAuthor);
        }



    }

}
