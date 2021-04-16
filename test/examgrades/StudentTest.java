package examgrades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

  @Test
  void getStudentName() {
    //Arrange
    Student student = new Student("Kamille");
    String expected = "Kamille";

    //Act
    String actual = student.getStudentName();

    //Assert
    assertEquals(expected, actual);
  }
}