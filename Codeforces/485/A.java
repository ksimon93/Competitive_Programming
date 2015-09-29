// loop is run 20 times since the max value of m is 1e6, and log2(1e6) = ~20
import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int m = in.nextInt();
    for (int i = 0; i < 20; i++) {
      if (a % m == 0) break;
      a *= 2;
    }
    if (a % m == 0) System.out.println("Yes");
    else System.out.println("No");
	}
}
