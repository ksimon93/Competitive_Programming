import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String s1 = in.nextLine();
    String s2 = in.nextLine();
    Map<Integer, Integer> possibilities = new HashMap<Integer, Integer>();
    int actual = 0;
    for (int i = 0; i < s1.length(); i++) {
      char c1 = s1.charAt(i);
      if (c1 == '+') actual++;
      if (c1 == '-') actual--;
    }

    solve(possibilities, s2, 0, 0);
    double solutions = possibilities.get(actual) != null ? possibilities.get(actual) : 0;
    int total = 0;
    for (Map.Entry<Integer, Integer> entry : possibilities.entrySet()) {
      total += entry.getValue();
    }
    System.out.println(solutions/total);
	}

  private static void solve(Map<Integer, Integer> map, String s2, int index, int accum) {
    if (index >= s2.length()) {
      if (map.get(accum) == null) {
        map.put(accum, 1);
      } else {
        int curr = map.get(accum);
        map.put(accum, curr+1);
      }
      return;
    }
    char c = s2.charAt(index);
    if (c == '+' || c == '?') solve(map, s2, index+1, accum+1);
    if (c == '-' || c == '?') solve(map, s2, index+1, accum-1);
  }
}
