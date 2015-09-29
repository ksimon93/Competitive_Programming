import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int i = in.nextInt();
    while (i != 42) {
      System.out.println(i);
      i = in.nextInt();
    }
	}
}
