package examgrades;

import java.util.Scanner;

public class Student {
  Scanner sc = new Scanner(System.in);

  //ATTRIBUTES
  private String studentName;
  private String studentID;
  Exam[] exams = new Exam[7];

  //CONSTRUCTOR
  public Student(String studentName, String studentID){
    setStudentName(studentName);
    setStudentID(studentID);
    registerExamGrades();
  }

  public Student(String studentName) {
    setStudentName(studentName);
  }

  //GETTER
  public String getStudentName() {
    return studentName;
  }

  public String getStudentID() {
    return studentID;
  }

  //SETTER
  public void setStudentName(String studentName) {
   this.studentName = studentName;
 }

  public void setStudentID(String studentID) { this.studentID = studentID;}

  //METHODS

  public void registerExamGrades(){

    for(int i = 0; i < 7; i++) {
    System.out.println("Enter name of the exam: ");
    String examName = sc.nextLine();
    System.out.println("Enter grade: ");
    int grade = sc.nextInt();
    sc.nextLine();
    if (grade != -3 && grade != 0 && grade != 2 && grade != 4 && grade != 7 && grade != 10 && grade != 12) {
      System.out.println("Enter a grade on the scale: ");
      grade = sc.nextInt();
      sc.nextLine();
    }

    Exam exam = new Exam(examName, grade);
    exams[i] = exam;
    }
  }

  @Override
  public String toString(){
    return "Student name: " + getStudentName() + "\nStudent ID: " + getStudentID();
  }
}