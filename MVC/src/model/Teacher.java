package model;

public class Teacher extends Worker {
    private String subject;

    public Teacher() {
    }
    
    public Teacher(String name, int age, String id, float wage, String subject) {
        super(name, age, id, wage);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    
}
