import java.util.Scanner;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    boolean dangerous = false;
    for (int i = 0; i < line.length(); i++) {
      dangerous = dangerous || isDangerous(i, line);
    }
    if (dangerous)
      System.out.println("YES");
    else
      System.out.println("NO");
  }

  private static boolean isDangerous(int i, String line) {
    if (i + 7 > line.length()) return false;
    char c = line.charAt(i);
    for (int j = 0; j < 7; j++) {
      if (line.charAt(i+j) != c) return false;
    }
    return true;
  }
}

