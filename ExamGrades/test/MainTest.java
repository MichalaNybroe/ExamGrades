import examgrades.Main;
import examgrades.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

  @Test
  void removeStudent() {
    //ARRANGE
    Main main = new Main();
    Student student = new Student("Signe", "123");
    String expected = "123";

    //ACT
    //String actual = main.removeStudent();

    //ASSERT
  }
}