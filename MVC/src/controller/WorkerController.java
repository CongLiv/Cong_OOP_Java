package controller;

import model.Worker;
import view.WorkerView;

public class WorkerController {
    private Worker model;   
    private WorkerView view;    
    public WorkerController(Worker model, WorkerView view){        
        this.model = model;        
        this.view = view;    
    }    
    public void setWorkerName(String name){        
        model.setName(name);    
    }    
    public String getWorkerName(){        
        return model.getName();    
    }    

    public void setWorkertAge(int age){        
        model.setAge(age);    
    }    
    public int getWorkertAge(){        
        return model.getAge();    
    }    

    public void setWorkerId(String id){        
        model.setId(id);    
    }    
    public String getWorkerId(){        
        return model.getId();    
    }    

    public float getWorkerWage(){        
        return model.getWage();    
    }    
    public void setWorkertWage(float wage){        
        model.setWage(wage);    
    }  
      
    public void updateView() {        
        view.printWorkerDetails(model);    
    }
}
