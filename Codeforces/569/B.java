import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];	
    boolean[] original = new boolean[n];
    boolean[] seen = new boolean[n];
    for (int i = 0; i < n; i++) {
      int ai = in.nextInt();
      arr[i] = ai;
      if (ai-1 < n) {
        original[ai-1] = true;
      }
    }

    int ogIndex = 0;
    for (int i = 0; i < n; i++) {
      int ai = arr[i];
      if (ai > n || seen[ai-1]) {
        while(original[ogIndex]) {
          ogIndex++;
        }
        System.out.print(ogIndex+1 + " ");
        original[ogIndex] = true;
        seen[ogIndex] = true;
      } else if (!seen[ai-1]) {
        System.out.print(ai + " ");
        seen[ai-1] = true;
      }
    }
  }
}
