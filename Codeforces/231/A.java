import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    int solves = 0;
    for (int i = 0; i < n; i++) {
      solves += willSolve(in.nextLine());
    }
    System.out.println(solves);
  }

  private static int willSolve(String s) {
    String[] parts = s.split(" ");
    int i = 0;
    for (String answer : parts) {
      i += Integer.parseInt(answer);
    }
    return i/2;
  }
}
