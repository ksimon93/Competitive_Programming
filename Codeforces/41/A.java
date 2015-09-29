import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String t = new StringBuilder(in.nextLine()).reverse().toString();
    if (s.equals(t))
      System.out.println("YES");
    else
      System.out.println("NO");
	}
}
