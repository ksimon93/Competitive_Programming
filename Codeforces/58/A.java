import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    char[] hello = {'h', 'e', 'l', 'l', 'o'};
    int j = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (j < hello.length && c == hello[j]) {
        j++;
      }
    }
    if (j == hello.length)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}
