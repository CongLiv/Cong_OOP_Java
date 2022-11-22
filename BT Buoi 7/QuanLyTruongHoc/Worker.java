package QuanLyTruongHoc;


public class Worker extends Person {
    private float wage;

    public Worker() {
    }
    
    public Worker(String name, int age, String id, float wage) {
        super(name, age, id);
        this.wage = wage;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    

    
}
