package leetcode.array;

import java.util.LinkedList;
import java.util.Queue;

public class UpdateMatrix {
    int[][] direction = {{0,1}, {1,0}, {-1,0}, {0,-1}};
    public int[][] updateMatrix(int[][] matrix) {
        int n = matrix.length; // 行
        int m = matrix[0].length; // 列
        int[][] result = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    result[i][j] = 0;
                    continue;
                } else {
                   BFS(matrix, result, i, j, n, m);
                }
            }
        }
        return result;
    }

    public void BFS(int[][] matrix, int[][] result, int i, int j, int n, int m) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        boolean flag = false;
        while (!queue.isEmpty() && flag == false) {
            count++;
            int size = queue.size();
            for (int t = 0; t < size && flag == false; t++) {
                int[] aim = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int x = direction[k][0] + aim[0];
                    int y = direction[k][1] + aim[1];
                    if (x >= 0 && x < n && y >= 0 && y < m) {
                        if (matrix[x][y] == 0) {
                            result[i][j] = count;
                            flag = true;
                            break;
                        } else queue.add(new int[]{x,y});
                    }
                }
            }
        }
    }

    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static void main(String[] args) {
        UpdateMatrix updateMatrix = new UpdateMatrix();
        updateMatrix.updateMatrix(new int[][]{{0,0,0},{0,1,0},{0,0,0}});
    }

   /* private void BFS(int[][] result, int[][] matrix, int i, int j, int n, int m) {
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        while (!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for (int t = 0; t < size; t++) {
                int[] aim = queue.poll();
                for (int k = 0; k < 4; k++) {
                    int x = direction[k][0] + aim[0];
                    int y = direction[k][1] + aim[1];
                    if (x >= 0 && x <= n && y >= 0 && y <= m) {
                        if (matrix[x][y] == 0) {
                            result[x][y] = count;
                            return;
                        } else BFS(result, matrix, x, y, n, m);
                    }
                }
            }
        }
    }*/
}
