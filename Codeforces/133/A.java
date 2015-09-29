import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String line = in.nextLine();
    boolean[] ascii = new boolean[256];
    ascii['H'] = true;
    ascii['Q'] = true;
    ascii['9'] = true;
    String result = "NO";
    for (char c : line.toCharArray()) {
      if (ascii[c])
        result = "YES";
    }
    System.out.println(result);
	}
}
