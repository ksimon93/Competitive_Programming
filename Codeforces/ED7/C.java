import java.io.*;
import java.util.*;

public class C {
    public static void main(String[] args) {
        MyScanner in = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = in.nextInt();
        int m = in.nextInt();

        int[] a = new int[n];
        int[] next = new int[n];
        next[n-1] = -2;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = n-2; i >= 0; i--) {
            if (a[i] != a[i+1]) next[i] = i+1;
            else next[i] = next[i+1];
        }


        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int x = in.nextInt();
            ans[i] = query(a, next, l-1, r-1, x);
        }

        for (int i : ans) {
            out.println(i+1);
        }
        out.close();

    }

    private static int query (int[] a, int[] next, int l, int r, int x) {
        if (a[l] != x) return l;
        if (next[l] > r) return -2;
        return next[l];
    }

    public static PrintWriter out;

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
