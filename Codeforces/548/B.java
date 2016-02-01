import java.util.Scanner;
public class B {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int q = in.nextInt();
        int[][] grid = new int[n][m];
        int[] scores = new int[q];
        //System.out.println("n: " + n + " m: " + m + " :q " + q);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = in.nextInt();
            }
        }

        int[] rowScores = new int[n];
        for (int i = 0; i < n; i++) {
            rowScores[i] = getRowScore(grid[i]);
        }

        for (int k = 0; k < q; k++) {
            int i = in.nextInt()-1;
            int j = in.nextInt()-1;

            grid[i][j] = grid[i][j] == 0 ? 1 : 0;
            int temp = getRowScore(grid[i]);
            rowScores[i] = temp;
            scores[k] = arrMax(rowScores);
        }
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
	}

    private static int getRowScore(int[] row) {
        if (row.length == 1) {
            return row[0];
        }
        int max = Integer.MIN_VALUE;
        int curr = 0;
        int prev = row[0];
        for (int i = 0; i < row.length; i++) {
            if (row[i] == 1 && prev == 1) {
                curr++;
            } else {
                max = Math.max(curr, max);
                curr = 1;
            }
            prev = row[i];
        }

        max = Math.max(curr, max);
        return max;
    }

    private static int arrMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static void printGrid(int[][] grid) {
        System.out.println();
        System.out.println("Printing grid");
        for (int i = 0; i < grid.length; i++) {
            System.out.print("Row " + i + ":");
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
