package myPack;

public class English extends Book{
    
    private int ISBN;

    
    public English() {
    }
    
    public English(String author, float price, int stock, int id, int iSBN) {
        super(author, price, stock, id);
        ISBN = iSBN;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }

    
}
