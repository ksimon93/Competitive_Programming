import java.util.Scanner;
import java.util.Arrays;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }

    Arrays.sort(arr);
    swap(arr, 0, arr.length-1);

    for (int i : arr) {
      System.out.print(i + " ");
    }
	}

  private static void swap(int[] arr, int i, int j) {
    if (arr.length == 1) return;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
