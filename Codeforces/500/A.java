import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t = in.nextInt();
    int[] a = new int[n];
    int pos = 1;
    for (int i = 1; i < n; i++) {
      a[i] = in.nextInt();
    }

    String output = "NO";
    while (pos < n) {
      if (pos == t) output = "YES";
      pos = pos + a[pos];
    }
    if (t == n) output = "YES";
    System.out.println(output);
	}
}
