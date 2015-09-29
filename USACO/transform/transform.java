/*
ID: kevin.s4
LANG: JAVA
TASK: transform
*/
import java.io.*;
import java.util.*;
public class transform {
	public static void main(String[] args) throws IOException {
		BufferedReader f = new BufferedReader(new FileReader("transform.in"));
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("transform.out")));
    int N = Integer.parseInt(f.readLine());
    String[] before = new String[N];
    String[] after = new String[N];
    for (int i = 0; i < N; i++) {
      before[i] = f.readLine();
    }
    
    for (int i = 0; i < N; i++) {
      after[i] = f.readLine();
    }

    int ans = check(before, after);
    out.println(ans);
		out.close();
		System.exit(0);
	}

  private static int check(String[] before, String[] after) {
    int ans = 7;
    if (Arrays.equals(before, after)) ans = 6;
    if (combination(before, after)) ans = 5;
    if (Arrays.equals(reflect(before), after)) ans = 4;
    if (Arrays.equals(rotate(before, 270), after)) ans = 3;
    if (Arrays.equals(rotate(before, 180), after)) ans = 2;
    if (Arrays.equals(rotate(before, 90), after)) ans = 1;
    return ans;
  }

  private static String[] rotate(String[] square, int deg) {
    String[] newSquare = Arrays.copyOf(square, square.length);
    for (int i = 0; i < deg/90; i++) {
      newSquare = rotate90(newSquare);
    }
    return newSquare;
  }

  private static String[] rotate90(String[] square) {
    String[] newSquare = new String[square.length];
    for (int i = 0; i < square.length; i++) {
      for (int j = 0; j < square.length; j++) {
        if (newSquare[j] == null) newSquare[j] = "";
        newSquare[i] = square[j].charAt(i) + newSquare[i];
      }
    }
    return newSquare;
  }

  private static String[] reflect(String[] square) {
    String[] newSquare = new String[square.length];
    for (int i = 0; i < square.length; i++) {
      char[] row = square[i].toCharArray();
      int j = 0;
      int k = newSquare.length-1;
      while (j < k) {
        char temp = row[j];
        row[j] = row[k];
        row[k] = temp;
        j++;
        k--;
      }
      newSquare[i] = new String(row);
    }
    return newSquare;
  }

  private static boolean combination(String[] before, String[] after) {
    String[] newBefore = reflect(before);
    return Arrays.equals(rotate(newBefore, 90), after) || Arrays.equals(rotate(newBefore, 180), after) || Arrays.equals(rotate(newBefore, 270), after);
  }
}
