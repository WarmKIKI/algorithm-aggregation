package leetcode.array;

public class NumRookCaptures {
    public int numRookCaptures(char[][] board) {
        int m = 8, i = 0, j = 0 ,count = 0;
        int[][] direction = {{-1,0},{1,0},{0,1},{0,-1}};
        boolean flag = false;
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                if(board[i][j] == 'R') {
                    flag = true;
                    break;
                }
            }
            if(flag == true) break;
        }
        for (int k = 0; k < 4; k++) {
            int x = i, y = j;
            while(true) {
                x += direction[k][0];
                y += direction[k][1];
                if(!judge(x,y,m)) break;
                if(board[x][y]=='B') {
                    break;
                } else if(board[x][y] == 'p') {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public boolean judge(int x, int y, int m) {
        return x>=0 && x<=m && y>0 && y<=m;
    }

    public static void main(String[] args) {
        NumRookCaptures num = new NumRookCaptures();
        int value = num.numRookCaptures(new char[][]{
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}});
        System.out.println(value);
    }
}
