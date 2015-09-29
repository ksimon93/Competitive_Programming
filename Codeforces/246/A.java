import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if (n == 1 || n == 2) {
      System.out.println(-1);
    } else {
      for (int i = 0; i < n; i++) {
        System.out.print(n-i + " ");
      }
    }
    //System.out.println();
    //sort(n);
	}

  private static void sort(int n) {
    int[] vals = new int[n];
    for (int i = 0; i < vals.length; i++) {
      vals[i] = n-i;
    }

    for (int i = 0; i < n-1; i++) {
      for (int j = i; j < n-1; j++) {
        if (vals[j] > vals[j+1]) {
          int temp = vals[j];
          vals[j] = vals[j+1];
          vals[j+1] = temp;
        }
      }
    }

    for (int i = 0; i < vals.length; i++) {
      System.out.print(vals[i] + " ");
    }
  }
}
