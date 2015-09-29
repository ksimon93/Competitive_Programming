import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String[] sides = in.nextLine().split("\\|");
    String line2 = in.nextLine();
    List<Character> list1 = new ArrayList<Character>();
    List<Character> list2 = new ArrayList<Character>();
    for (int i = 0; sides.length > 0 && i < sides[0].length(); i++) {
      char c = sides[0].charAt(i);
      list1.add(c);
    }

    for (int i = 0; sides.length > 1 && i < sides[1].length(); i++) {
      char c = sides[1].charAt(i);
      list2.add(c);
    }

    for (char c : line2.toCharArray()) {
      if (list1.size() <= list2.size()) {
        list1.add(c);
      } else {
        list2.add(c);
      }
    }

    if (list1.size() != list2.size()) {
      System.out.println("Impossible");
    } else {
      String ans = "";
      while (!list1.isEmpty()) {
        ans += list1.remove(0);
      }
      ans += "|";
      while (!list2.isEmpty()) {
        ans += list2.remove(0);
      }
      System.out.println(ans);
    }
	}
}
