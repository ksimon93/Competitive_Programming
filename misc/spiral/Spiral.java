import java.util.Scanner;
public class Spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        spiral(arr);
    }

    private static void spiral(int[][] arr) {
        int endColumn = arr[0].length-1;
        int endRow = arr.length-1;
        int startColumn = 0;
        int startRow = 0;

        while (endColumn >= startColumn && endRow >= startRow) {
            for (int i = startColumn; i <= endColumn; i++) {
                System.out.print(arr[startRow][i] + " ");
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endColumn] + " ");
            }
            endColumn--;

            for (int i = endColumn; i >= startColumn; i--) {
                System.out.print(arr[endRow][i] + " ");
            }
            endRow--;

            for (int i = endRow; i >= startRow; i--) {
                System.out.print(arr[i][startColumn] + " ");
            }
            startColumn++;
        }
        
    }
}
