package exercises_One;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import fizzBuzz.FizzBuzz;
import org.junit.Test;

public class TestExercises_1to6 {

  private Exercises exercises;

  @Before
  public void init(){
    exercises = new Exercises();
  }

  ///////////////////////////////   6   ///////////////////////////////////
  // Skriv testfall för funktionen isPrime(int) som ska returnera true om parametern är ett
  // primtal. Primtal är tal som bara är jämnt delbara med sig själva och ett. De första primtalen
  // (1 räknas inte) är: 2, 3, 5, 7, 11, 13, 17, 19, 29, 31...
  @Test
  public void isPrime(){
    boolean expected = true;
    int value = 13;
    boolean actual = exercises.isPrime(value);
    assertEquals(expected, actual);
  }

  ///////////////////////////////   5   ///////////////////////////////////
  // Skriv testfall för funktionen String repeat(char, int). Den ska ta ett tecken och ett heltal
  // som parameter, och returnera en string med lika många kopior av tecknet som talet. Tips:
  // fundera på vilka olika sorters tillåtna respektive otillåtna värden respektive parameter har.
  // Specen är inte fullständig utan du måste göra designbeslut.

  @Test
  public void repeat(){
    String expected = "rrrr";
    char value1 = 'r';
    int value2 = 4;
    String actual = exercises.repeat(value1, value2);
    assertEquals(expected, actual);
  }

  ///////////////////////////////   4   ///////////////////////////////////
  // Skriv testfall för funktionen isOdd(int x) som ska returnera true om parametern x är ett udda tal.

  @Test
  public void isOdd(){
    boolean expected = true;
    int value = 5;
    boolean actual = exercises.isOdd(value);
    assertEquals(expected, actual);
  }

  ///////////////////////////////   3   ///////////////////////////////////
  // Skriv testfall för funktionen int multiply(int, int) som ska ta två heltal som parametrar och
  // returnerar deras produkt. Exempel: multiply(2, 5) → 10

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
  // Skriv testfall för funktionen isTrue(bool) som ska returnera true om parametern är true
  // och false annars.

  @Test
  public void isTrue(){
    boolean expected = true;
    boolean value = true;
    boolean actual = exercises.isTrue(value);
    assertEquals(expected, actual);
  }


  ///////////////////////////////   1   ///////////////////////////////////
  // Skriv testfall för funktionen renderParagraph, som ska ta en sträng som parameter och
  // returnera en sträng som motsvarar en HTML-paragraf. Exempel:
  // renderParagraph("hello") ! "<p>hello</p>"

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
