import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    in.nextLine();
    char[][] graph = new char[n][m];
    for (int i = 0; i < n; i++) {
      String row = in.nextLine();
      for (int j = 0; j < m; j++) {
        graph[i][j] = row.charAt(j);
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        if (graph[i][j] == '-') continue;
        dfs('W', graph, i, j);
      }
    }

    String ans = "";
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ans += graph[i][j];
      }
      ans += "\n";
    }
    System.out.println(ans);
	}

  private static void dfs(char color, char[][] graph, int i, int j) {
    if (i >= graph.length || i < 0 || j >= graph[i].length || j < 0) return;
    if (graph[i][j] != '.') return;
    graph[i][j] = color;
    char newColor = color == 'W' ? 'B' : 'W';
    dfs(newColor, graph, i, j-1);
    dfs(newColor, graph, i-1, j);
    dfs(newColor, graph, i, j+1);
    dfs(newColor, graph, i+1, j);
  }
}
