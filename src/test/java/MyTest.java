import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyTest {
  @Test
  public void nameOfTest() {
    String expected = "TEST";
    String actual =  Main.toUppercase("text");
    assertEquals(expected, actual);
  }
}