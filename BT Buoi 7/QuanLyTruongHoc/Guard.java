package QuanLyTruongHoc;

public class Guard extends Worker {
    
    private String shift;


    public Guard(String name, int age, String id, float wage, String shift) {
        super(name, age, id, wage);
        this.shift = shift;
    }

    public Guard() {
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    
}
