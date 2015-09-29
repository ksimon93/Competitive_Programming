import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    long[] ans = new long[n];
    for (int i = 0; i < n; i++) {
      ans[i] = solve(in.nextInt());
    }
    for (long l: ans) {
      System.out.println(l);
    }
	}

  private static long solve(int n) {
    if (n == 0 || n == 1) return 0;
    long sum = 1;
    for (int i = 2; Math.pow(i,2) <= n ; i++) {
      if (n % i == 0) { 
        sum += i;
        if (n/i != i) {
          sum += n/i;
        }
      }
    }
    return sum;
  }
}
