package exercises_One;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import fizzBuzz.FizzBuzz;
import org.junit.Test;

public class TestExercises {

  private Exercises exercises;

  @Before
  public void init(){
    exercises = new Exercises();
  }

  ///////////////////////////////   5   ///////////////////////////////////
  @Test
  public void repeat(){
    String expected = "rrrr";
    char value1 = 'r';
    int value2 = 4;
    String actual = exercises.repeat(value1, value2);
    assertEquals(expected, actual);
  }


  ///////////////////////////////   4   ///////////////////////////////////
  @Test
  public void isOdd(){
    boolean expected = true;
    int value = 5;
    boolean actual = exercises.isOdd(value);
    assertEquals(expected, actual);
  }

  ///////////////////////////////   3   ///////////////////////////////////
  @Test
  public void multiply(){
    int expected = 10;
    int value1 = 2;
    int value2 = 5;
    int actual = exercises.multiply(value1, value2);
    assertEquals(expected, actual);
  }

  @Test
  public void multiplyNoll(){
    int expected = 0;
    int value1 = 2;
    int value2 = 0;
    int actual = exercises.multiply(value1, value2);
    assertEquals(expected, actual);
  }

  ///////////////////////////////   2   ///////////////////////////////////
  @Test
  public void isTrue(){
    boolean expected = true;
    boolean value = true;
    boolean actual = exercises.isTrue(value);
    assertEquals(expected, actual);
  }

  ///////////////////////////////   1   ///////////////////////////////////
  @Test
  public void renderParagraph(){
    //Arrange
    String text = "iths";
    String expected = "<p>iths</p>";
    String actual;
    //Act
    actual = exercises.renderParagraph(text);
    //Assert
    assertEquals(expected, actual);
  }

  @Test
  public void renderParagraphByNull(){
    String text = null;
    String expected = "<p></p>";
    String actual;
    actual = exercises.renderParagraph(text);
    assertEquals(expected, actual);
  }



}
