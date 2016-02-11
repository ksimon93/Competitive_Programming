import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] a = new int[m][n];
        int[][] b = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = -1;
                b[i][j] = in.nextInt();
            }
        }

        boolean solveable = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 0) {
                    for (int k = i; k < m; k++) {
                        a[k][j] = 0;
                    }

                    for (int k = i; k >= 0; k--) {
                        a[k][j] = 0;
                    }

                    for (int k = j; k < n; k++) {
                        a[i][k] = 0;
                    }

                    for (int k = j; k >= 0; k--) {
                        a[i][k] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (b[i][j] == 1) {
                    int temp = 0;
                    for (int k = i; k < m; k++) {
                        temp = Math.min(temp, a[k][j]);
                    }

                    for (int k = i; k >= 0; k--) {
                        temp = Math.min(temp, a[k][j]);

                    }

                    for (int k = j; k < n; k++) {
                        temp = Math.min(temp, a[i][k]);
                    }

                    for (int k = j; k >= 0; k--) {
                        temp = Math.min(temp, a[i][k]);
                    }

                    if (temp == 0) {
                        solveable = false;
                    }
                }
            }
        }

        if (solveable) {
            System.out.println("YES");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]*-1 + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
