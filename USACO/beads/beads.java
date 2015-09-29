/*
ID: kevin.s4
LANG: JAVA
TASK: beads
*/
import java.io.*;
import java.util.*;
public class beads {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("beads.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("beads.out")));
    int n = Integer.parseInt(f.readLine());
    String s = f.readLine();
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
      String straight = s.substring(i+1) + s.substring(0,i+1);
      char[] beads = straight.toCharArray();
      int temp = 0;
      char color = ' ';
      for (int j = 0; j < n; j++) {
        char currColor = beads[j];
        if (color == ' ' && currColor != 'w') color = currColor;
        if (currColor == color || currColor == 'w') temp++;
        else break;
      }

      color = ' ';
      for (int j = n-1; j > -1; j--) {
        char currColor = beads[j];
        if (color == ' ' && currColor != 'w') color = currColor;
        if (currColor == color || currColor == 'w') temp++;
        else break;
      }
      max = Math.max(temp, max);
    }
    if (max > n) max = n;
    out.println(max);
		out.close();
		System.exit(0);
	}
}
