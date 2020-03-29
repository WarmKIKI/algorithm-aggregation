package map;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDistance {
    public int maxDistance(int[][] grid) {
        int m = grid.length; // 行
        int n = grid[0].length; //列
        int distance = -1;
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
                int x = land[0], y = land[1];
                if(x-1 >= 0 && grid[x-1][y] == 0) {
                    grid[x-1][y] = 1;
                    queue.add(new int[]{x-1, y});
                }
                if(x+1 < m && grid[x+1][y] == 0) {
                    grid[x+1][y] = 1;
                    queue.add(new int[]{x+1, y});
                }
                if(y-1 >= 0 && grid[x][y-1] == 0) {
                    grid[x][y-1] = 1;
                    queue.add(new int[]{x, y-1});
                }
                if(y+1 < n && grid[x][y+1] == 0) {
                    grid[x][y+1] = 1;
                    queue.add(new int[]{x, y+1});
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

    public static void main(String[] args) {
        MaxDistance distance = new MaxDistance();
        int value = distance.maxDistance(new int[][]{{1,0,1},{0,0,0},{1,0,1}});
        System.out.println(value);
    }
}
