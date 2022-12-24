import QuanLy.*;

public class Entry{
    public static void main(String[] args) {
        Person person = new Person("cong", 18, 0, "11211188");
        System.out.println(person.getGender());

        Student student = new Student("Cong", 18, 0, "11211188", "CNTT");
        System.out.println(student.getGender());

        Teacher teacher = new Teacher("Minh", 19, 0, "11111", 1000, 2);
        System.out.println(teacher.getSubject());

        Guard guard = new Guard("Huy", 19, 0, "2222", 10, 1);
        System.out.println(guard.getShift());
        
}
}