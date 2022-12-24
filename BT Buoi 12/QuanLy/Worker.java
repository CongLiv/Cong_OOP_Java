package QuanLy;


public class Worker extends Person {
    private float wage;

    public Worker() {
    }
    
    
    public Worker(String name, int age, int g, String id, float wage) {
        super(name, age, g, id);
        this.wage = wage;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    
}
