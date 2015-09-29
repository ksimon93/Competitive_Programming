/*
ID: kevin.s4
LANG: JAVA
TASK: milk2
*/
import java.io.*;
import java.util.*;
public class milk2 {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("milk2.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("milk2.out")));
    int n = Integer.parseInt(f.readLine());
    int[] count = new int[1000000];
    int start = Integer.MAX_VALUE;
    int end = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(f.readLine());
      int tempStart = Integer.parseInt(st.nextToken());
      int tempEnd = Integer.parseInt(st.nextToken());
      start = Math.min(tempStart, start);
      end = Math.max(tempEnd, end);
      for (int j = tempStart; j < tempEnd; j++) {
        count[j]++;
      }
    }

    int a = Integer.MIN_VALUE;
    int b = Integer.MIN_VALUE;
    int tempa = 0;
    int tempb = 0;
    for (int i = start; i < end; i++) {
      if (count[i] != 0) {
        tempa++;
        b = Math.max(tempb, b);
        tempb = 0;
      }
      else {
        tempb++;
        a = Math.max(tempa, a);
        tempa = 0;
      }
    }
    a = Math.max(tempa, a);
    b = Math.max(tempb, b);
    out.println(a + " " + b);
		out.close();
		System.exit(0);
	}
}
