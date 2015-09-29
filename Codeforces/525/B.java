import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    String s = in.nextLine();
    char[] cs = s.toCharArray();
    int[] freq = new int[200001];
    int m = Integer.parseInt(in.nextLine());
    for (int i = 0; i < m; i++) {
      int ai = in.nextInt();
      freq[ai]++;
    }

    int sum = 0;
    for (int i = 1; i <= s.length()/2; i++) {
      sum += freq[i];
      if (sum % 2 == 0) continue;
      swap(i-1, s.length()-i, cs);
    }
    System.out.println(new String(cs));
	}

  private static void reverse(int j, int k, char[] cs) {
    while (j < k) {
      char temp = cs[j];
      cs[j] = cs[k];
      cs[k] = temp;
      j++;
      k--;
    }
  }

  private static void swap(int j, int k, char[] cs) {
    char temp = cs[j];
    cs[j] = cs[k];
    cs[k] = temp;
  }
}
