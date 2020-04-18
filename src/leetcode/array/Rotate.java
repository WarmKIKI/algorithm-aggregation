package leetcode.array;

public class Rotate {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ints = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ints[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][n - i - 1] = ints[i][j];
            }
        }
    }
}
