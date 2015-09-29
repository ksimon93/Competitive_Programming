import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int M = in.nextInt();
    int N = in.nextInt();

    int answer = (M*N) / 2;
    System.out.println(answer);
  }
}
