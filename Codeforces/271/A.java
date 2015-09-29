import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int y = in.nextInt();
    for (int i = y+1;; i++) {
      if (isUnique(i)) {
        System.out.println(i);
        break;
      }
    }
  }
  private static boolean isUnique(int n) {
      char[] cs = (n+"").toCharArray();
      Set<Character> temp = new HashSet<Character>();
      for (char c : cs) {
        temp.add(c);
      }
      return temp.size() == 4;
  }
}
