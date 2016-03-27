import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int x1 = in.nextInt();
        int y1 = in.nextInt();
        double dist = 0.0;

        for (int i = 1; i < n; i++) {
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            dist += Math.pow(Math.pow(Math.abs(x1 - x2), 2) + Math.pow(Math.abs(y1 - y2), 2), .5);
            x1 = x2;
            y1 = y2;
        }
        System.out.println(k * (dist / 50));
    }
}
