import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i = 5;
    int cans = 0;
    while (cans+i < n) {
      cans += i;
      i *= 2;
    }
    int perPerson = i/5;
    for (int j = 1; j <= 5; j++) {
      if (cans+(perPerson*j) >= n) {
        printAnswer(j);
        break;
      }
    }
  }

  private static void printAnswer(int j) {
    if (j == 1)
      System.out.println("Sheldon");
    else if (j == 2)
      System.out.println("Leonard");
    else if (j == 3)
      System.out.println("Penny");
    else if (j == 4)
      System.out.println("Rajesh");
    else if (j == 5)
      System.out.println("Howard");
  }
}
