package leetcode.dynamic_drogramming;
// leetcode 695:最大岛屿面积
public class MaxAreaOfIsland {
    int[][] direction = {{-1,0},{0,-1},{0,1},{1,0}};
    int m,n,num;
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length; // 行
        n = grid[0].length; //列
        num = 0;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    grid[i][j] = 0;
                    num++;
                    dfs(i, j, grid);
                }
                if(num > max) max = num;
                num = 0;
            }
        }
        return max;
    }

    private void dfs(int i, int j, int[][] grid) {
        for (int k = 0; k < 4; k++) {
            int x = i + direction[k][0];
            int y = j + direction[k][1];
            if(judge(x,y) && grid[x][y] == 1) {
                grid[x][y] = 0;
                num++;
                dfs(x,y,grid);
            }
        }
    }

    private boolean judge(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

    public static void main(String[] args) {
        MaxAreaOfIsland msc = new MaxAreaOfIsland();
        msc.maxAreaOfIsland(new int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}});
    }
}
