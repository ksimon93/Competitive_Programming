import java.util.Scanner;
import java.util.Arrays;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] coins = new int[n];
    int sum = 0;
    for (int i = 0; i < n; i++) {
      int coin = in.nextInt();
      sum += coin;
      coins[i] = coin;
    }

    int takenSum = 0;
    int taken = 0;
    Arrays.sort(coins);
    int i = n-1;
    while (takenSum <= sum) {
      takenSum += coins[i];
      sum -= coins[i];
      taken++;
      i--;
    }
    System.out.println(taken);
  }
}
