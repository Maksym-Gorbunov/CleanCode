package temp;

import org.junit.Test;
import temp.App;

import static org.junit.Assert.assertEquals;

public class MyTest {
  @Test
  public void nameOfTest() {
    String expected = "TEST";
    String actual =  App.toUppercase("text");
    assertEquals(expected, actual);
  }

}