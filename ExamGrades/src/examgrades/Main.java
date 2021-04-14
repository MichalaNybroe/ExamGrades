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
    String[] menuItems = new String[4];
    menuItems[0] = "1. View student list";
    menuItems[1] = "2. Register student";
    menuItems[2] = "3. Remove student";
    menuItems[3] = "9. Quit";

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
        case 9:
          System.out.println("QUIT");
          break;
        default:
          System.out.println("NOT A VALID INPUT");
      }
    }
  }

  private void showStudentList() {
    for(int i = 0; i < students.size(); i++){
      System.out.println("Student number: " + (i + 1) + "\n" + students.get(i).toString());
      for(int j = 0; j < 7; j++) {
        System.out.println(students.get(i).exams[j].toString());
      }
      System.out.println();
    }
    System.out.println();
  }

  public void registerStudent(){
    System.out.println("Enter the name of the student: ");
    String name = sc.nextLine();
    System.out.println("Enter the student ID: ");
    String studentId = sc.nextLine();

    Student student = new Student(name, studentId);

    students.add(student);
  }

  public void removeStudent() {
    System.out.println("Which student is to be removed?\nPlease enter their number.");
    int studentNumber = sc.nextInt();
    System.out.println();
    students.remove(students.get(studentNumber - 1));
  }
}