import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int l = in.nextInt();
    int m = in.nextInt();
    int n = in.nextInt();
    int d = in.nextInt();

    int damaged = 0;
    for (int i = 1; i <= d; i++) {
      if (isDamaged(i, k, l, m, n))
        damaged++;
    }
    System.out.println(damaged);
  }

  private static boolean isDamaged(int i, int k, int l, int m, int n) {
    return i%k==0 || i%l==0 || i%m==0 || i%n==0;
  }
}
