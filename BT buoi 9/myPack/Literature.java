package myPack;

public class Literature extends Book{
    
    private int taiban;
    
    public Literature() {
    }

    
    public Literature(String author, float price, int stock, int id, int taiban) {
        super(author, price, stock, id);
        this.taiban = taiban;
    }


    public int getTaiban() {
        return taiban;
    }

    public void setTaiban(int taiban) {
        this.taiban = taiban;
    }
    
}
