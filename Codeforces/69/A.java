import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x,y,z;
    x = y = z = 0;
    for (int i = 0; i < n; i++) {
      x += in.nextInt();
      y += in.nextInt();
      z += in.nextInt();
    }

    if (x == 0 && y == 0 && z == 0) System.out.println("YES");
    else System.out.println("NO");
	}
}
