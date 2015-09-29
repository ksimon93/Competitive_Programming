import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int ans;
    if (n == 1) {
      ans = 1;
    } else if (n == 2) {
      ans = m == 1 ? 2 : 1;
    } else {
      if (n/2 >= m) {
        ans = m+1;
      } else {
        ans = m-1;
      }
    }
    System.out.println(ans);
	}
}
