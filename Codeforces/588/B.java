import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class B {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long i = 2;
        long ans = 1;

        while (i*i <= n) {
            if (n % i == 0) {
                ans *= i;
            }

            while (n % i == 0) {
                n /= i;
            }

            i++;
        }
        ans *= n;
        System.out.println(ans);
	}
}
