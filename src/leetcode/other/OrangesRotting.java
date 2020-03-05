package leetcode.other;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        int count = -1;
        if(grid == null) return -1;
        Queue<int[]> queue = new ConcurrentLinkedQueue();
        int n = grid.length;
        int m = grid[0].length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                } else if(grid[i][j] == 1) {
                    flag = true;
                }
            }
        }
        if(flag == false) return 0;
        if(queue.isEmpty()) return -1;
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] temp = queue.poll();
                int x = temp[0], y = temp[1];
                if(x - 1 >= 0 && grid[x-1][y] == 1) {
                    queue.add(new int[]{x-1, y});
                    grid[x-1][y] = 2;
                }
                if(x + 1 < n && grid[x+1][y] == 1) {
                    queue.add(new int[]{x+1, y});
                    grid[x+1][y] = 2;
                }
                if(y-1 > 0 && grid[x][y-1] == 1) {
                    queue.add(new int[]{x, y-1});
                    grid[x][y-1] = 2;
                }
                if(y+1 < m && grid[x][y+1] == 1) {
                    queue.add(new int[]{x, y+1});
                    grid[x][y+1] = 2;
                }
            }
        }
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                if(grid[i][j] == 1) return -1;
        return count;
    }
}
