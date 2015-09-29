import java.util.Scanner;
public class C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    int count = 0;
    for (int i = 1; i < n-1; i++) {
      for (int j = i+1; j < n; j++) {
        if (isEqual(i, j, arr)) count++;
      }
    }
    System.out.println(count);
	}

  private static boolean isEqual(int i, int j, int[] arr) {
    int sum1, sum2, sum3;
    sum1 = sum2 = sum3 = 0;

    for (int k = 0; k < i; k++) {
      sum1 += arr[k];
    }

    for (int k = i; k < j; k++) {
      sum2 += arr[k];
    }

    for (int k = j; k < arr.length; k++) {
      sum3 += arr[k];
    }

    return sum1 == sum2 && sum2 == sum3;
  }
}
