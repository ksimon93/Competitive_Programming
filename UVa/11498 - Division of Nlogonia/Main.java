import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> ans = new ArrayList<String>();
        int k = in.nextInt();
        while (k != 0) {
            int divX = in.nextInt();
            int divY = in.nextInt();

            for (int i = 0; i < k; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int diffX = x-divX;
                int diffY = y-divY;

                if (diffX == 0 || diffY == 0) {
                    ans.add("divisa");
                } else if (diffY > 0 && diffX < 0) {
                    ans.add("NO");
                } else if (diffY > 0 && diffX > 0) {
                    ans.add("NE");
                } else if (diffY < 0 && diffX > 0) {
                    ans.add("SE");
                } else {
                    ans.add("SO");
                }
            }
            k = in.nextInt();
        }
        for (String answer : ans) {
            System.out.println(answer);
        }
    }
}
