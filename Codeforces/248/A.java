import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int left = 0;
    int right = 0;
    for (int i = 0; i < n; i++) {
      left += in.nextInt();
      right += in.nextInt();
    }
    int sum = 0;
    if (left >= n-left)   sum += n-left;
    else                  sum += left;
    if (right >= n-right) sum += n-right;
    else                  sum += right;
    System.out.println(sum);
	}
}
