package examgrades;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  //ATTRIBUTES
  Scanner sc = new Scanner(System.in);
  ArrayList<Student> students = new ArrayList<>();

  //METHODS
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    String[] menuItems = new String[3];
    menuItems[0] = "1. View studentlist";
    menuItems[1] = "2. Register student";
    menuItems[2] = "9. Quit";

    Menu studentMenu = new Menu("Student Menu:", "Choose an option", menuItems);

    int choice = 0;

    while (choice != 9) {
      studentMenu.printMenu();
      choice = studentMenu.readChoice();
      switch (choice) {
        case 1:
          showStudentList();
          break;
        case 2:
          registerStudent();
          break;
        case 3:
          removeStudent();
          break;
        default:
          System.out.println("NOT A VALID INPUT");
      }
    }
  }

<<<<<<< HEAD
  private void showStudentList() {
    for(int i = 0; i < students.size(); i++){
      System.out.println(students.get(i));
    }
  }

  public void registerStudent(){
=======
  public void registerStudent() {
>>>>>>> dc5ebdd9a75172b5886a1828fce0d36ea55a4895

    System.out.println("Enter the name og the student: ");
    String name = sc.nextLine();
    System.out.println("Enter the student ID: ");
    String studentId = sc.nextLine();

    Student student = new Student(name, studentId);

    students.add(student);
  }

  public void removeStudent() {
    System.out.println("Which student is to be removed?\nPlease Write their studentID");
    String removableStudent = sc.nextLine();
    System.out.println();
    for (int i = 0; i < students.size(); i++) {
      if (removableStudent.equals(students.get(i).getStudentID())) {
        students.remove(students.get(i));
      }
      System.out.println("This is not a registered studentID");
    }
  }
}
