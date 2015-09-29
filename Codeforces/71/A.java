import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    String[] answers = new String[n];
    for (int i = 0; i < n; i++) {
      answers[i] = abbreviate(in.nextLine());
    }

    for (String s : answers) {
      System.out.println(s);
    }
  }

  private static String abbreviate(String s) {
    if (s.length() <= 10) return s;
    int length = s.length(); 
    char[] cs = s.toCharArray();
    return cs[0] + "" + (length-2) + "" + cs[length-1];
  }
}
