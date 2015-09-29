import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    Set<Character> set = new HashSet<Character>();
    String line = in.nextLine();
    for (char c : line.toCharArray()) {
      if (c >= 'a' && c <= 'z') set.add(c);
    }
    System.out.println(set.size());
	}
}
