import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int max = 0;
    int cap = 0;
    for (int i = 0; i < n; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      cap = cap - a + b;
      max = Math.max(cap, max);
    }
    System.out.println(max);
  }
}
