package exercises_One;

public class Exercises {

  public String repeat(char symbol, int total) {
    String result = "";
    for (int i = 0; i < total; i++) {
      result += symbol;
    }
    return result;
  }

  public boolean isOdd(int value) {
    if (value % 2 != 0) return true;
    return false;
  }

  public int multiply(int value1, int value2) {
    return value1 * value2;
  }

  public boolean isTrue(boolean value) {
    return value;
  }

  public String renderParagraph(String text) {
    String start = "<p>";
    String end = "</p>";
    if (text == null) return (start + "" + end);
    return (start + text + end);
  }
}
