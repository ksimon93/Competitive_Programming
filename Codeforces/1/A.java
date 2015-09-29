import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long n = in.nextInt();
    long m = in.nextInt();
    long a = in.nextInt();

    // fast int ceil = (num + divisor - 1) / divisor
    long length = (n + a - 1) / a;
    long width  = (m + a - 1) / a;
    System.out.println(length*width);
  }
}
      
