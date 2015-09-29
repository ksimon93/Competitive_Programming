import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int max = Integer.MIN_VALUE;
    int maxi = -1;
    int min = Integer.MAX_VALUE;
    int mini = -1;
    for (int i = 0; i < n; i++) {
      int a = in.nextInt();
      if (a > max) {
        max = a;
        maxi = i;
      }

      if (a <= min) {
        min = a;
        mini = i;
      }
    }
    int ans = maxi+(n-1-mini);
    if (maxi > mini) ans--;
    System.out.println(ans);
	}
}
