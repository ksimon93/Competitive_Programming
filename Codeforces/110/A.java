import java.util.Scanner;
public class A {
	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long val = in.nextLong();
    System.out.println(isNearlyLucky(val));
	}

  private static boolean isLucky(long val) {
    String temp = val + "";
    for (int i = 0; i < temp.length(); i++) {
      char c = temp.charAt(i);
      if (c != '4' && c != '7') return false;
    }
    return true;
  }

  private static String isNearlyLucky(long val) {
    long temp = numOfLuckyDigits(val);
    return isLucky(temp) ? "YES" : "NO";
  }

  private static long numOfLuckyDigits(long val) {
    String temp = val + "";
    long count = 0;
    for (int i = 0; i < temp.length(); i++) {
      char c = temp.charAt(i);
      if (c == '7' || c == '4') count++;
    }
    return count;
  }
}
