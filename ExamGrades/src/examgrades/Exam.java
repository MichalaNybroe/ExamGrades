package examgrades;

public class Exam {

  //ATTRIBUTES
  private String examName;
  private int grade;

  //CONSTRUCTOR
  public Exam(String name, int grade) {
    setName(name);
    setGrade(grade);
  }

  //GETTER
  public String getExamName(){
    return examName;
  }

  public int getGrade(){
  return grade;
  }

  //SETTER
  public void setName(String name){
    this.examName = name;
  }

  public void setGrade (int grade){
    this.grade = grade;
  }

  //METHODS

  @Override
  public String toString(){
    return "The grade you got in " + getExamName() + " was: " + getGrade();
  }
}