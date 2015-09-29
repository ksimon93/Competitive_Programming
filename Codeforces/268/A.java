import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] home = new int[101];
    int[] away = new int[101];
    for (int i = 0; i < n; i++) {
      int h = in.nextInt();
      int a = in.nextInt();
      home[h]++;
      away[a]++;
    }

    int ans = 0;
    for (int i = 0; i < home.length; i++) {
      ans += home[i] * away[i];
    }
    System.out.println(ans);
	}
}
