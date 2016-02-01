import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] ans = new String[t];

        for (int i = 0; i < ans.length; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                ans[i] = "=";
            } else if (a < b) {
                ans[i] = "<";
            } else {
                ans[i] = ">";
            }
        }

        for (String answer : ans) {
            System.out.println(answer);
        }
    }
}
