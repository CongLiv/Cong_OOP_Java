package view;

import model.Student;

public class StudentView {

    public void printStudentDetails (Student student)
    {
        System.out.println("Student Details: ");    
        System.out.println("Name: " + student.getName());  
        System.out.println("Age: " + student.getAge());  
        System.out.println("Student ID: " + student.getId());    
        System.out.println("Student Class: " + student.get__class());
        System.out.println("----------------------------------");
    }
        
    

}
