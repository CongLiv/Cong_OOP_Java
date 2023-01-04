import model.Worker;
import controller.StudentController;
import controller.WorkerController;
import model.Student;
import view.StudentView;
import view.WorkerView;

public class Entry {
    public static void main(String[] args) {
        Student model = new Student("Cong", 19, "112", "CNTT63");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentClass("CNTT 63B");

        controller.updateView();


        Worker model2 = new model.Worker("Minh", 20, "111", 1000);
        WorkerView view2 = new WorkerView();
        WorkerController controller2 = new WorkerController(model2, view2);

        controller2.updateView();

        controller2.setWorkertWage(2000);
        controller2.updateView();

    }
}
