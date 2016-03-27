import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            int k = in.nextInt();
            s = query(s, l, r, k);
        }
        System.out.println(s);
    }

    private static String query(String s, int l, int r, int k) {
        char[] orig = s.toCharArray();
        char[] copy = s.toCharArray();

        int length = r-l+1;
        int start = (k % length) + (l - 1);

        int x = start;
        int y = l-1;
        for (int i = 0; i < length; i++) {
            copy[x] = orig[y];
            x += 1;
            y += 1;

            if (x >= r) {
                x = l-1;
            }
        }
        return new String(copy);
    }
}
