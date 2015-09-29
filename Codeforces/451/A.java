import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int min = n > m ? m : n;
    if (min % 2 == 0)
      System.out.println("Malvika");
    else
      System.out.println("Akshat");
	}
}
