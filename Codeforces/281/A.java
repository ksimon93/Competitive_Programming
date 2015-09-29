import java.util.Scanner;
public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    String result = word.substring(0,1).toUpperCase() + word.substring(1);
    System.out.println(result);
  }
}
