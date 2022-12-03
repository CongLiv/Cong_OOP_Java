package myPack;

public class Science extends Book{
    
    private int NamXB;

    public Science() {
    }
    
    public Science(String author, float price, int stock, int id, int namXB) {
        super(author, price, stock, id);
        NamXB = namXB;
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int namXB) {
        NamXB = namXB;
    }
    
}
