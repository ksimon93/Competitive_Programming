import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int[] candidates = new int[n];
    int max, index;
    for (int i = 0; i < m; i++) {
      max = Integer.MIN_VALUE;
      index = -1;
      for (int j = 0; j < n; j++) {
        int votes = in.nextInt();
        if (votes > max) {
          max = votes;
          index = j;
        }
      }
      candidates[index]++;
    }

    max = Integer.MIN_VALUE;
    index = -1;
    for (int i = 0; i < n; i++) {
      if (candidates[i] > max) {
        max = candidates[i];
        index = i;
      }
    }
    System.out.println(index+1);
	}
}
