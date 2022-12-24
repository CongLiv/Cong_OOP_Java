package QuanLy;
import Enum.Subject;

public class Teacher extends Worker {
    private Subject subject;

    public Teacher() {
    }

    public Teacher(String name, int age, int g, String id, float wage, int sub) {
        super(name, age, g, id, wage);
        this.subject = Subject.__getSubject(sub);
    }

    public void setSubject(int sub)
    {
        this.subject = Subject.__getSubject(sub);
    }

    public Subject getSubject()
    {
        return this.subject;
    }

   

    

    
}
