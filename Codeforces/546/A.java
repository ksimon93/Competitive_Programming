import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int n = in.nextInt();
    int w = in.nextInt();
    int money = ((w*(w+1))/2)*k;
    if (money > n) {
      System.out.println(money-n);
    } else {
      System.out.println(0);
    }
	}
}
