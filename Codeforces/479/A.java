import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int ans = solve(a,b,c);
    System.out.println(ans);
	}

  private static int solve(int a, int b, int c) {
    int max = 0;
    max = Math.max(a+b+c,max);
    max = Math.max(a*(b+c),max);
    max = Math.max((a*b)+c,max);
    max = Math.max(a+(b*c),max);
    max = Math.max((a+b)*c,max);
    max = Math.max(a*b*c,max);
    return max;
  }
}
