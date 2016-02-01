import java.util.Scanner;
public class A {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String in = input.nextLine();
        boolean found = false;
        for (int i = 1; i <= in.length(); i++) {
            for (int j = 0; j < in.length()-i+1; j++) {
                String r = in.substring(0, j);
                String s = in.substring(j,j+i);
                String t = in.substring(j+i);
                if ("CODEFORCES".equals(r+t)) found = true;
            }
        }
        if (found) System.out.println("YES");
        else System.out.println("NO");
	}
}
