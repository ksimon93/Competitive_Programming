import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Integer[] a = new Integer[n];
        int[] b = new int[m];
        int[] ans = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);

        for (int j = 0; j < m; j++) {
            b[j] = in.nextInt();
        }

        for (int j = 0; j < m; j++) {
            ans[j] = bsearch(b[j], a, 0, a.length-1);
        }

        for (int ansj: ans) {
            System.out.print(ansj + " ");
        }
    }

    private static int bsearch(int val, Integer[] a, int start, int end) {
        if (start > end || a[start] > val) {
            return start;
        }

        int mid = start + ((end - start) / 2);
        if (val >= a[mid]) {
            return bsearch(val, a, mid+1, end);
        }
        return bsearch(val, a, start, mid);
    }
}
