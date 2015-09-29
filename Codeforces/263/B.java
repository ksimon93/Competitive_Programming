import java.util.Scanner;
import java.util.Arrays;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int k = in.nextInt();
    int[] squares = new int[n];
    for (int i = 0; i < n; i++) {
      squares[i] = in.nextInt();
    }
    Arrays.sort(squares);
    if (k > n) {
      System.out.println(-1);
      return;
    }
    System.out.println(squares[n-k] + " " + squares[n-k]);
	}
}
