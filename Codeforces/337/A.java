import java.util.Scanner;
import java.util.Arrays;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] puzzles = new int[m];
    for (int i = 0; i < m; i++) {
      puzzles[i] = in.nextInt();
    }
    Arrays.sort(puzzles);
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < m-n+1; i++) {
      int diff = puzzles[i+n-1] - puzzles[i];
      min = Math.min(min, diff);
    }
    System.out.println(min);
	}
}
