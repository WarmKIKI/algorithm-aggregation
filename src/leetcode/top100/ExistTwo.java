package leetcode.top100;

//       x-1,y
// x,y-1  x,y   x,y+1
//       x+1,y

public class ExistTwo {
    private boolean[][] marked;
    private int[][] direction = {{-1,0},{0,-1},{0,1},{1,0}};
    private int n; // 列
    private int m; // 行
    private String word;
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        if(m == 0) return false;
        marked = new boolean[m][n];
        this.word = word;
        this.board = board;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(int i, int j, int start) {
        if(start == word.length() - 1) {
            return word.charAt(start) == board[i][j];
        }
        if(board[i][j] == word.charAt(start)) {
            marked[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                if(inArea(newX, newY) && !marked[newX][newY]) {
                    if(dfs(newX, newY, start + 1)) {
                        return true;
                    }
                }
            }
            marked[i][j] = false;
        }
        return false;
    }

    private boolean inArea(int newX, int newY) {
        return newX > 0 && newX < m && newY > 0 && newY < n;
    }
}
