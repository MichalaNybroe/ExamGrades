import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

  public void run() {
    String[] menuItems = new String[3];
    menuItems[0] = "1. View studentlist";
    menuItems[1] = "2. Register student";
    menuItems[2] = "9. Quit";

    Menu studentMenu = new Menu("Student Menu:", "Choose an option", menuItems);

    int choice;
    boolean keepRunning = true;

    do {
      studentMenu.printMenu();
      choice = studentMenu.readChoice();
      switch () {

      }
    } while ()
    registerStudent();
  }
}
