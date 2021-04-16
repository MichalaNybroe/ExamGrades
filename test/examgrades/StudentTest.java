package examgrades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

  /*
  @Test
  void registerExamGrades() {
    //Arrange
    Student student = new Student("Michala", "76");
    Exam[] expected = new Exam[7];

    expected[0] = new Exam("History", 00);
    expected[1] = new Exam("Biology", 7);
    expected[2] = new Exam("Mathematics", 10);
    expected[3] = new Exam("Social science", 4);
    expected[4] = new Exam("Programming", 12);
    expected[5] = new Exam("PE", -3);
    expected[6] = new Exam("Latin", 02);


    //Act
    Exam[] actual = new Exam[7];

    actual[0] = new Exam("History", 00);
    actual[1] = new Exam("Biology", 7);
    actual[2] = new Exam("Mathematics", 10);
    actual[3] = new Exam("Social science", 4);
    actual[4] = new Exam("Programming", 12);
    actual[5] = new Exam("PE", -3);
    actual[6] = new Exam("Latin", 02);

    student.registerExamGrades();

    //Assert
    assertEquals(expected, actual);
  }

   */

  @Test
  void getStudentName() {
    //Arrange
    Student student = new Student("Kamille", "23");
    String expected = "Kamille";

    //Act
    String actual = student.getStudentName();

    //Assert
    assertEquals(expected, actual);

  }

}