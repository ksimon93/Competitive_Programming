import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    Set<Integer> shoes = new HashSet<Integer>();
    for (int i = 0; i < 4; i++) {
      shoes.add(in.nextInt());
    }
    System.out.println(4-shoes.size());
	}
}
