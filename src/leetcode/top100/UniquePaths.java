package leetcode.top100;

// 动态规划

public class UniquePaths {
    public int uniquePaths(int m, int n) { // m为列， n为行
        int[][] aim = new int[n][m];
        int i, j = 0;
        for (int k = 0; k < m; k++) {
            aim[0][k] = 1;
        }
        for (int k = 0; k < n; k++) {
            aim[k][0] = 1;
        }
        for (i = 1; i < n; i++) {
            for (j = 1; j < m; j++) {
                aim[i][j] = aim[i-1][j] + aim[i][j-1];
            }
        }
        return aim[n-1][m-1];
    }

    public static void main(String[] args) {
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(2, 1));
    }
}
