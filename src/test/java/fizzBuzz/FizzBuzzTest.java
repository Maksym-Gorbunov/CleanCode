package fizzBuzz;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import fizzBuzz.FizzBuzz;
import org.junit.Test;

public class FizzBuzzTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setup(){
    fizzBuzz = new FizzBuzz();
  }

  @Test
  public void testNumber(){
    int number = 1;
    String result = fizzBuzz.play(number);
    assertEquals("1", result);
  }

  @Test
  public void testFizz(){
    int number = 3;
    String result = fizzBuzz.play(number);
    assertEquals("Fizz", result);
  }

  @Test
  public void testFizzDivisibleBu3(){
    int number = 9;
    String result = fizzBuzz.play(number);
    assertEquals("Fizz", result);
  }

  @Test
  public void testBuzz(){
    int number = 5;
    String result = fizzBuzz.play(number);
    assertEquals("Buzz", result);
  }

  @Test
  public void testBuzzDivisibleBy5(){
    int number = 10;
    String result = fizzBuzz.play(number);
    assertEquals("Buzz", result);
  }

  @Test
  public void testBuzzDivisibleBy5And3(){
    int number = 15;
    String result = fizzBuzz.play(number);
    assertEquals("FizzBuzz", result);
  }
}
