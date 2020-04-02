package leetcode.array;

public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int n = board.length; // 行
        int m = board[0].length; //列
        int[][] direction = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int survive = 0; // 记录该位置周围活细胞的个数
                for (int k = 0; k < 8; k++) {
                    int x = i + direction[k][0];
                    int y = j + direction[k][1];
                    if(x >= 0 && x < n && y >= 0 && y < m && temp[x][y] == 1) survive++; else continue;
                }
                if(temp[i][j] == 0 && survive == 3) board[i][j] = 1;
                if(temp[i][j] == 1 && (survive > 3 || survive <2)) board[i][j] = 0;
            }
        }
    }

    public void print(int[][] temp) {
        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[0].length; j++) {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("------------");
    }

    public static void main(String[] args) {
        GameOfLife game = new GameOfLife();
        game.gameOfLife(new int[][]{ {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}});
    }
}
