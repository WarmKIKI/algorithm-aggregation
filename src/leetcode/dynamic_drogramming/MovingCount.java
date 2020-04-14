package leetcode.dynamic_drogramming;

public class MovingCount {
    int[][] direction = {{0, 1},{0, -1},{1, 0},{-1, 0}};
    int count = 0;
    public int movingCount(int m, int n, int k) {
        int[][] grid = new int[m][n];
        dfs(grid, k, 0, 0, m, n);
        return count;
    }

    private void dfs(int[][] grid, int k, int i, int j, int m, int n) {
        grid[i][j] = 1;
        int sum = getSum(i) + getSum(j);
        if(sum <= k) count++;
        else return;
        print(grid);
        for (int l = 0; l < 4; l++) {
            int x = direction[l][0] + i;
            int y = direction[l][1] + j;
            if(x>=0 && x<m && y>=0 && y<n && grid[x][y] == 0) {
                dfs(grid, k, x, y, m, n);
            }
        }
    }

    public int getSum(int i) {
        int t = i, sum = 0;
        while(t != 0) {
            sum += t % 10;
            t = t / 10;
        }
        return sum;
    }

    private void print(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        MovingCount movingCount = new MovingCount();
        System.out.println(movingCount.movingCount(3,2,17));
    }
}
