public class Student {

  //ATTRIBUTES
  private String name;
  private String studentID;
  Exam[] exams = new Exam[7];

  //CONSTRUCTOR
  public Student(String name, String studentID){
    setName(name);
    setStudentID(studentID);
  }

  //GETTER
  public String getName() {
    return name;
  }

  public String getStudentID() {
    return studentID;
  }

  //SETTER
  public void setName(String name) {
   this.name = name;
 }

  public void setStudentID(String studentID) { this.studentID = studentID;}

  //METHODS

  public void registerExamGrades(){
    
  }

  public void showGrades() {
    for (int i = 0; i < exams.length; i++) {
      System.out.printf("Exam number %d:\n %s\n", i, exams[i]);
    }
    System.out.println();
  }
}