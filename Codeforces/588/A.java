import java.util.Scanner;
public class A {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cost = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int ai = in.nextInt();
            int pi = in.nextInt();
            min = Math.min(min, pi);
            cost += ai * min;
        }
        System.out.println(cost);
	}
}
