public class Exam {

  //ATTRIBUTES
  private String name;
  private int grade;

  //CONSTRUCTOR
  public Exam(String name, int grade) {
    setName(name);
    setGrade(grade);
  }

  //GETTER
  public String getName(){
    return name;
  }

  public int getGrade(){
  return grade;
  }

  //SETTER
  public void setName(String name){
    this.name = name;
  }

  public void setGrade(int grade){
    this.grade = grade;
  }

  //METHODS

  @Override
  public String toString(){
    return "The grade you got in " + getName() + " was: " + getGrade();
  }
}
