package QuanLy;

public class Student extends Person{
    
    private String __class;
    

    public Student(String name, int age, int g, String id, String __class) {
        super(name, age, g, id);
        this.__class = __class;
    }

    public Student() {
    }
    
    public String get__class() {
        return __class;
    }

    public void set__class(String __class) {
        this.__class = __class;
    }
    
}
