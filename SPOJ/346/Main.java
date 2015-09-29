import java.util.Scanner;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class Main {
  static long[] memo = new long[1000000];
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
    StringBuilder out = new StringBuilder();
    while(in.hasNextLong()) {
      long n = in.nextLong();
      long money = solve(n);
      out.append(money+"\n");
    }
    System.out.print(out);
  }

  private static long solve(long n) {
    if (n < 12) return n;
    if (n < 1000000 && memo[(int) n] != 0) return memo[(int) n];
    long money = Math.max(n,solve(n/2) + solve(n/3) + solve(n/4));
    if (n < 1000000) memo[(int) n] = money;
    return money;
  }
}
