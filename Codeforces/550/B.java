import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int l = in.nextInt();
    int r = in.nextInt();
    int x = in.nextInt();
    int[] problems = new int[n];
    int count = 0;
    for (int i = 0; i < n; i++) {
      problems[i] = in.nextInt();
    }

    for (int i = 0; i < 1 << n; i++) {
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      int sum = 0;
      int amount = 0;
      for (int j = 0; j < n; j++) {
        if (((1 << j) & i) > 0) {
          min = Math.min(min, problems[j]);
          max = Math.max(max, problems[j]);
          sum += problems[j];
          amount++;
        }
      }
      if (amount >= 2 && sum >= l && sum <= r && max-min >= x) {
        count++;
      }
    }
    System.out.println(count);
	}
}
