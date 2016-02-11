import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        long pos = 1;
        long newest = 1;
        while (pos < n) {
            newest += 1;
            pos += newest;
        }

        long ans = newest - (pos - n);

        System.out.println(ans);
    }
}
