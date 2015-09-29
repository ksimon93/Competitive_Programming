import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    int x = 0;
    for (int i = 0; i < n; i++) {
      if (in.nextLine().contains("+"))
          x++;
      else
        x--;
    }
    System.out.println(x);
  }
}
