import java.util.Scanner;
import java.util.Arrays;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    boolean[] primes = sieve(1000000);
    for (int i = 3; i < n; i++) {
      if (!primes[i] && !primes[n-i]) {
        System.out.println(i + " " + (n-i));
        break;
      }
    }
	}

  private static boolean[] sieve(int n) {
    boolean[] isPrime = new boolean[n+1]; 
    Arrays.fill(isPrime, true);
    for (int i = 2; i < n; i++) {
      for (int j = 2*i; j < n; j += i) {
        isPrime[j] = false;
      }
    }
    return isPrime;
  }
}
