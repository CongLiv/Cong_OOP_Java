package QuanLy;
import Enum.*;

public class CleanStaff extends Worker {
    
    private WorkArea workArea;

    public CleanStaff() {
    }


    public CleanStaff(String name, int age, int g, String id, float wage, int area) {
        super(name, age, g, id, wage);
        this.workArea = WorkArea.__getWorkArea(area);
    }


    public WorkArea getWordArea() {
        return this.workArea;
    }

    public void setWordArea(int area) {
        this.workArea = WorkArea.__getWorkArea(area);
    }

    
}
