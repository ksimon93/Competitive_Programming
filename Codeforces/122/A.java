import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean almostLucky = false;
    for (int i = 0; i <= n; i++) {
      if (isLucky(i) && n % i == 0) almostLucky = true;
    }
    if (almostLucky) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
	}

  private static boolean isLucky(int n) {
    String temp = n + "";
    for (int i = 0; i < temp.length(); i++) {
      char c = temp.charAt(i);
      if (c != '4' && c != '7') return false;
    }
    return true;
  }
}
