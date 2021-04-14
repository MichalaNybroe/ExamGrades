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

<<<<<<< HEAD
  void registerExamGrades(){
    System.out.println("Enter name of the exam: ");
    String examName = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter grade: ");
    int grade = sc.nextInt();
    sc.nextLine();
=======
  public void registerExamGrades(){
    
>>>>>>> 7850d4747848d3599ee2e81cb5d306ec3db4048e
  }

  public void showGrades() {
    for (int i = 0; i < exams.length; i++) {
      System.out.printf("Exam number %d: %s\n", i, exams[i]);
    }
    System.out.println();
  }
}