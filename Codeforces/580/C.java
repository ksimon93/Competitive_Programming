import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class C {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] cats = new int[n+1];
        for (int i = 1; i <= n; i++) {
            cats[i] = in.nextInt();
        }

        Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < n-1; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            List<Integer> adj = graph.get(start);
            if (adj == null) {
                graph.put(start, new ArrayList<>());
                adj = graph.get(start);
            }
            adj.add(end);

            adj = graph.get(end);
            if (adj == null) {
                graph.put(end, new ArrayList<>());
                adj = graph.get(end);
            }
            adj.add(start);
        }

        boolean[] visited = new boolean[n+1];
        System.out.println(dfs(1, cats[1], m, graph, cats, visited));
	}

    private static int dfs(int node, int count, int max, Map<Integer, List<Integer>> graph, int[] cats, boolean[] visited) {
        visited[node] = true;
        if (count > max) return 0;
        List<Integer> adj = graph.get(node); 
        int temp = 0;
        boolean isLeaf = true;
        for (Integer i : adj) {
            int nextCount = cats[node] == 1 ? count : 0;
            if (visited[i]) continue;
            isLeaf = false;
            temp += dfs(i, nextCount+cats[i], max, graph, cats, visited);
        }
        return isLeaf ? 1 : temp;
    }
}
