import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        int time = n-1;
        int height = 0;
        for (int hi : h) {
            time += Math.abs(height - hi) + 1;
            height = hi;
        }

        System.out.println(time);
    }
}
