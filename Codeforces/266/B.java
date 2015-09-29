import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int t = in.nextInt();
    in.nextLine();
    char[] line = in.nextLine().toCharArray();
    for (int i = 0; i < t; i++) {
      for (int j = 0; j < n-1; j++) {
        if (line[j] == 'B' && line[j+1] == 'G') {
          line[j] = 'G';
          line[j+1] = 'B';
          j++;
        }
      }
    }
    System.out.println(line);
	}
}
