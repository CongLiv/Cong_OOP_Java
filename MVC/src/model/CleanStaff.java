package model;

public class CleanStaff extends Worker {
    
    private String workArea;

    public CleanStaff() {
    }

    public CleanStaff(String name, int age, String id, float wage, String wordArea) {
        super(name, age, id, wage);
        this.workArea = wordArea;
    }


    public String getWordArea() {
        return workArea;
    }

    public void setWordArea(String wordArea) {
        this.workArea = wordArea;
    }

    
}
