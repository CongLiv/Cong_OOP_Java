package view;

import model.Worker;

public class WorkerView {

    public void printWorkerDetails (Worker worker)
    {
        System.out.println("Worker Details: ");    
        System.out.println("Name: " + worker.getName());  
        System.out.println("Age: " + worker.getAge());  
        System.out.println("Worker ID: " + worker.getId());    
        System.out.println("Wage: " + worker.getWage());
        System.out.println("----------------------------------");
    }
    
}
