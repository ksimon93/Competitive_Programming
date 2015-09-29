import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    String t = in.nextLine();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != t.charAt(i)) {
        sb.append("1");
      } else {
        sb.append("0");
      }
    }
    System.out.println(sb.toString());
	}
}
