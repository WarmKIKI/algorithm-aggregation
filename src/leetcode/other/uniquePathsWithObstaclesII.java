package leetcode.other;

// leetcode:63
public class uniquePathsWithObstaclesII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) { // m是行，n是列
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1) return 0;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(obstacleGrid[0][i] == 1 || flag == true) {
                obstacleGrid[0][i] = 0;
                flag = true;
            } else {
                obstacleGrid[0][i] = 1;
            }
        }
        get(m,n,obstacleGrid);
        for (int i = 1; i < m; i++) {
            if(obstacleGrid[i][0] == 1 || flag == false) {
                obstacleGrid[i][0] = 0;
                flag = false;
            }
            else obstacleGrid[i][0] = 1;
        }
        get(m,n,obstacleGrid);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                    get(m,n,obstacleGrid);
                    continue;
                }
                obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                get(m,n,obstacleGrid);
            }
        }
        return obstacleGrid[m-1][n-1];
    }

    public void get(int m, int n, int[][] obstacleGrid) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(obstacleGrid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        uniquePathsWithObstaclesII unique = new uniquePathsWithObstaclesII();
        int result = unique.uniquePathsWithObstacles(new int[][]{{0,1,0},{1,1,0},{0,0,0}});
        System.out.println(result);
    }
}
