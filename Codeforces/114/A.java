import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int k = in.nextInt();
    int l = in.nextInt();

    long j = k;
    int count = 0;
    while (j < l && j > 0) {
      j *= k;
      count++;
    }

    if (j == l) {
      System.out.println("YES");
      System.out.println(count);
    } else {
      System.out.println("NO");
    }
	}
}
