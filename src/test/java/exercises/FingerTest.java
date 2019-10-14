package exercises;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.List;

public class FingerTest {

  private Finger finger;

  @Before
  public void init(){
    finger = new Finger();
  }

  @Test
  public void isFinger(){
    boolean actual = finger.isFinger(5);
    assertEquals(true, actual);
  }
  @Test
  public void isFingerReturnFalse(){
    boolean actual = finger.isFinger(7);
    assertEquals(false, actual);
  }

}
