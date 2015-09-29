import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class A {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] letters = in.nextLine().toCharArray();
    Set<Character> distinct = new HashSet<>();
    for (char c : letters) {
      distinct.add(c);
    }

    if (distinct.size() % 2 == 1) {
      System.out.println("IGNORE HIM!");
    } else {
      System.out.println("CHAT WITH HER!");
    }
  }
}
