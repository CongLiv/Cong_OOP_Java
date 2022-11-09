import java.util.ArrayList;
import java.util.Scanner;

import myPack.*;

public class Entry {

    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[])
    {
          //Student a = new Student("Cong", 17, "IT63B", 9.0, 10, 8.0);
          //System.out.println(a.increaseScore().averageScore());\
          //Student b = new Student();

          //System.out.println(a.test + " " + b.test);

          ArrayList<Student> students = new ArrayList<>();

          System.out.println("Nhap so sv: ");
          int n;
          n = scan.nextInt();

          for (int i = 0; i < n; i++)
          {
            Student student = new Student();
            student.input();
            students.add(student);
          }

          for (int i = 0; i < n; i++)
          {
            students.get(i).output();
          }


    }
}
