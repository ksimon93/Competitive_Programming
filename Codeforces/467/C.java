import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
public class C {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        long[] arr = new long[n+1];
        long[] sum = new long[n+1];
        long[][] dp = new long[n+1][k+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i-1]+arr[i];
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (i >= m) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-m][j-1]+sum[i]-sum[i-m]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
