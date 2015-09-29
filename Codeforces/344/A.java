import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = Integer.parseInt(in.nextLine());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i ++) {
      sb.append(in.nextLine());
    }
    char[] cs = sb.toString().toCharArray();
    int count = 1;
    for (int i = 1; i < cs.length-1; i+=2) {
      if (cs[i] == cs[i+1]) count++;
    }
    System.out.println(count);
	}
}
