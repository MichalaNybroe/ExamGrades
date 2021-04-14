import exam.NotAGrade;

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

  public void setGrade(int grade){
    if(grade != -3 || grade != 0 || grade != 2 || grade != 4 || grade != 7 || grade != 10 || grade != 12){
      //throws new NotAGrade;
    }
    this.grade = grade;
  }

  //METHODS

  @Override
  public String toString(){
    return "The grade you got in " + getExamName() + " was: " + getGrade();
  }
}