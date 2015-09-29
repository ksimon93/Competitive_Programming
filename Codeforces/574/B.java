import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int recognition = Integer.MAX_VALUE;
    Map<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();

    for (int i = 0; i < m; i++) {
      int ai = in.nextInt();
      int bi = in.nextInt();
      if (graph.get(ai) == null) 
        graph.put(ai, new ArrayList<Integer>());
      if (graph.get(bi) == null)
        graph.put(bi, new ArrayList<Integer>());
      graph.get(ai).add(bi);
      graph.get(bi).add(ai);
    }

    for (int i = 1; i <= n; i++) {
      List<Integer> adji = graph.get(i);
      if (adji == null) continue;
      for (int j: adji) {
        List<Integer> adjj = graph.get(j);
        if (adjj == null) continue;
        for (int k: adjj) {
          List<Integer> adjk = graph.get(k);
          if (adjk == null) continue;
          if (adjk.contains(i)) {
            recognition = Math.min(recognition, (adji.size()-2)+(adjj.size()-2)+(adjk.size()-2));
          }
        }
      }
    }
    recognition = recognition == Integer.MAX_VALUE ? -1 : recognition;
    System.out.println(recognition);
	}
}
