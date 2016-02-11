import java.io.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        List<Integer> componentSize = new ArrayList<Integer>();
        char[][] graph = new char[n][m];
        for (int i = 0; i < n; i++) {
            graph[i] = br.readLine().toCharArray();
        }

        int component = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == '.') {
                    int size = dfs(graph,i,j,component);
                    componentSize.add(size);
                    component += 1;
                }
            }
        }

        String[] out = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuffer temp = new StringBuffer();
            for (int j = 0; j < m; j++) {
                if (graph[i][j] == '*') {
                    temp.append(componentSum(graph, i, j, componentSize)%10);
                } else {
                    temp.append('.');
                }
            }
            out[i] = temp.toString();
        }

        for (String str : out) {
            pw.println(str);
        }
        pw.close();
    }

    private static int dfs(char[][] graph, int i, int j, int component) {
        int count = 0;
        Stack<Pair> stack = new Stack<Pair>();
        stack.push(new Pair(i, j));

        while (!stack.isEmpty()) {
            Pair cur = stack.pop();
            if (cur.i < 0 || cur.j < 0) continue;
            if (cur.i >= graph.length || cur.j >= graph[0].length) continue;
            if (graph[cur.i][cur.j] != '.') continue;
            graph[cur.i][cur.j] = (char) (component + '0');
            count += 1;
            stack.push(new Pair(cur.i+1, cur.j));
            stack.push(new Pair(cur.i-1, cur.j));
            stack.push(new Pair(cur.i, cur.j-1));
            stack.push(new Pair(cur.i, cur.j+1));
        }
        return count;
    }

    private static int componentSum(char[][] graph, int i, int j, List<Integer> componentSize) {
        List<Integer> seen = new ArrayList<Integer>();
        int sum = 1;
        for (int k = i-1; k <= i+1; k += 2) {
            if (k < 0 || k >= graph.length) continue;
            if (graph[k][j] == '*') continue;
            int component = graph[k][j] - '0';
            if (seen.contains(component)) continue;
            seen.add(component);
            sum += componentSize.get(component);
        }

        for (int k = j-1; k <= j+1; k += 2) {
            if (k < 0 || k >= graph[0].length) continue;
            if (graph[i][k] == '*') continue;
            int component = graph[i][k] - '0';
            if (seen.contains(component)) continue;
            seen.add(component);
            sum += componentSize.get(component);
        }
        return sum;
    }

    private static void printGraph(char[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[0].length; j++) {
                System.out.print(graph[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] deepCopy(char[][] toCopy) {
        char[][] newCopy = new char[toCopy.length][toCopy[0].length];
        for (int i = 0; i < toCopy.length; i++) {
            for (int j = 0; j < toCopy[0].length; j++) {
                newCopy[i][j] = toCopy[i][j];
            }
        }
        return newCopy;
    }

    private static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
