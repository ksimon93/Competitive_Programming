import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    long n = in.nextLong();
    long val = (long) Math.ceil(n/2.0);
    if (n % 2 == 1) {
      System.out.println(val*-1);
    } else {
      System.out.println(val);
    }
	}
}
