package designpattern_and_principles;

public class test {
	public static void main(String[] args) {
       
        Student student = new Student("Rohan", 5, "B");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Rohan");
        controller.setStudentGrade("B");

        controller.updateView();
    }
}
