import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int hours = 0;
    while (a >= b) {
      hours += (a/b)*b;
      a = (a/b)+(a%b);
    }
    System.out.println(hours+a);
	}
}
