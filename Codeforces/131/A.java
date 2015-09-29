import java.util.Scanner;
public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    if (allButFirstCaps(word)) {
      char[] cs = word.toLowerCase().toCharArray();
      cs[0] -= 32;
      word = new String(cs);
    } else if (allCaps(word)) {
      word = word.toLowerCase();
    }
    System.out.println(word);
  }

  private static boolean allCaps(String s) {
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 97) return false;
    }
    return true;
  }

  private static boolean allButFirstCaps(String s) {
    return s.charAt(0) >= 97 && allCaps(s.substring(1));
  }
}
