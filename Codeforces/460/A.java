import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int days = 0;
    while (n >= m) {
      days += (n/m)*m;
      n = (n/m)+(n%m);
    }
    System.out.println(days+n);
	}
}
