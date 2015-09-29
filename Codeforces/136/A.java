import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      int num = in.nextInt();
      ans[num-1] = i+1;
    }
    for (int i = 0; i < n; i++) {
      System.out.print(ans[i] + " ");
    }
	}
}
