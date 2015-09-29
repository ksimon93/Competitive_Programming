import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    int b = in.nextInt();
    int[] players = new int[2];
    players[0] = a;
    players[1] = b;
    int n = in.nextInt();
    for (int i = 0;;i++) {
      int player = players[i%2];
      int gcd = gcd(player, n);
      if (n == 0 || gcd == 0) {
        System.out.println((i+1)%2);
        break;
      }
      n -= gcd;
    }
	}

  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
}
