import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void toUppercase() {
    String expected = "TEXT";
    String actual =  Main.toUppercase("text");
    assertEquals(expected, actual);
  }

  @Test
  public void toUppercaseCheckNull(){
    String expected = "";
    String actual = Main.toUppercase(null);
    assertEquals(expected, actual);
  }
}