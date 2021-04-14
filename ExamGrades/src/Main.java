import java.util.ArrayList;
import java.util.Scanner;

public class Main {
<<<<<<< HEAD
  Scanner sc = new Scanner(System.in);
  ArrayList<Student> students = new ArrayList<>();

  public void registerStudent(){

    System.out.println("Enter the name og the student: ");
    String name = sc.nextLine();
    System.out.println("Enter the student ID: ");
    String studentId = sc.nextLine();

    Student student = new Student(name, studentId);

    students.add(student);
  }


=======


  public void run() {
    String[] menuItems = new String[3];

    registerStudent();
  }


  
>>>>>>> d833b0bcae64996b3f870d4c4e1d80b1e773e15a
}
