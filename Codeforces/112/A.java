import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s1 = in.nextLine().toLowerCase();
    String s2 = in.nextLine().toLowerCase();
    int result = s1.compareTo(s2);
    if (result < 0)
      result = -1;
    else if (result > 0)
      result = 1;
    System.out.println(result);
  }
}
