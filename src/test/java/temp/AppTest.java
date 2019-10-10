package temp;

import org.junit.Test;
import temp.App;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AppTest {

  @Test
  public void toUppercase_convertToUppercase() {
    String expected = "TEXT";
    String actual =  App.toUppercase("text");
    assertEquals(expected, actual);
  }

  @Test
  public void toUppercase_castNullPointerExceptionIfArgumentIsNull(){
    assertThrows(NullPointerException.class, () -> {
      App.toUppercase(null);
    });
  }

  @Test(expected = NullPointerException.class)
  public void toUppercase_castNullPointerExceptionIfArgumentIsNull2(){
    App.toUppercase(null);
  }

  @Test
  public void whenDerivedExceptionThrown_thenAssertionSucceds() {
    String test = null;
    assertThrows(RuntimeException.class, () -> {
      test.length();
    });
  }

}