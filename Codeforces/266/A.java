import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    String line = in.nextLine();
    String newLine = removeRepeat(line);
    System.out.println(line.length()-newLine.length());
  }

  private static String removeRepeat(String in) {
    if (in.length() >= 2 && in.charAt(0) == in.charAt(1)) 
      return removeRepeat(in.substring(1));
    else if (in.length() >= 2)
      return in.charAt(0) + removeRepeat(in.substring(1));
    return in;
  }
}
