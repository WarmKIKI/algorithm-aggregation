package map;

import java.util.LinkedList;
import java.util.Queue;

// 地图分析
public class MaxDistanceII {
    public int maxDistance(int[][] grid) {
        int m = grid.length; // 行
        int n = grid[0].length; //列
        int distance = -1;
        int[][] direction = {{-1,0},{1,0},{0,-1},{0,1}};
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j] == 1) {
                    queue.add(new int[]{i,j});
                }
            }
        }
        if(queue.isEmpty() || queue.size() == m*n) return -1;
        while(queue.size() != 0) {
            distance++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] land = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x = direction[j][0] + land[0], y =direction[j][1]+land[1];
                    if(x>=0 && x<m && y>=0 && y<n && grid[x][y] == 0) {
                        grid[x][y] = 1;
                        queue.add(new int[]{x, y});
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("--------------");
        }
        return distance;
    }

}
