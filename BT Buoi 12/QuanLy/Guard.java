package QuanLy;
import Enum.*;
public class Guard extends Worker {
    
    private Shift shift;


    public Guard(String name, int age, int g, String id, float wage, int sft) {
        super(name, age, g, id, wage);
        this.shift = Shift.__getShift(sft);
    }

    public Guard() {
    }

    public Shift getShift() {
        return this.shift;
    }

    public void setShift(int sft) {
        this.shift = Shift.__getShift(sft);
    }

    
}
