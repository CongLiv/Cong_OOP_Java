package controller;

import model.Student;
import view.StudentView;

public class StudentController {
    private Student model;   
    private StudentView view;    
    public StudentController(Student model, StudentView view){        
        this.model = model;        
        this.view = view;    
    }    
    public void setStudentName(String name){        
        model.setName(name);    
    }    
    public String getStudentName(){        
        return model.getName();    
    }    

    public void setStudentAge(int age){        
        model.setAge(age);    
    }    
    public int getStudentAge(){        
        return model.getAge();    
    }    

    public void setStudentId(String id){        
        model.setId(id);    
    }    
    public String getStudentId(){        
        return model.getId();    
    }    

    public String getStudentClass(){        
        return model.get__class();    
    }    
    public void setStudentClass(String __class){        
        model.set__class(__class);    
    }  
      
    public void updateView() {        
        view.printStudentDetails(model);    
    }
}
