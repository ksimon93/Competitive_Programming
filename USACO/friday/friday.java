/*
ID: kevin.s4
LANG: JAVA
TASK: friday
*/
import java.io.*;
import java.util.*;
public class friday {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("friday.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		StringTokenizer st = new StringTokenizer(f.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] count = new int[7];
    int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int daysThisMonth;
    int currentDay = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < 12; j++) {
        daysThisMonth = daysInMonth[j];
        if (j == 1 && isLeapYear(1900+i)) {
          daysThisMonth++;
        }
        currentDay = (currentDay+13)%7;
        count[currentDay]++;
        currentDay = (currentDay+(daysThisMonth-13))%7;
      }
    }
    String ans = "";
    for (int i = 0; i < count.length; i++) {
      ans += count[i] + " ";
    }
    out.println(ans.substring(0,ans.length()-1));
		out.close();
		System.exit(0);
	}

  private static boolean isLeapYear(int year) {
    if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))) {
      return true;
    }
    return false;
  }
}
