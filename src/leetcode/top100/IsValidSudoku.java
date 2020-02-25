package leetcode.top100;

import java.util.HashSet;
import java.util.Set;

public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length; // 行
        int n = board[0].length; // 列
        for (int i = 0; i < m; i++) {
            Set<Character> Xset = new HashSet<>();
            Set<Character> Yset = new HashSet<>();
            for (int j = 0; j < n; j++) {
                Character c = board[i][j];
                Character b = board[j][i];
                if((!c.equals('.') && Xset.contains(c))
                        || (!b.equals('.') && Yset.contains(b))) {
                    return false;
                } else {
                    Xset.add(c);
                    Yset.add(b);
                }
            }
        }
        int extra = 0;
        int count = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();
        for (int i = start; i < 3 + start; i++) {
            if(i == 9) break;
            count++;
            for (int j = extra; j < 3 + extra; j++) {
                if(i%3 == 0 && j%3 == 0) set = new HashSet<>();
                Character x = board[i][j];
                if(set.contains(x) && !x.equals('.')) {
                    return false;
                } else {
                    set.add(x);
                }
            }
            if(count%3 == 0) { extra += 3; i = start-1;}
            if(count == 9) { i += 3; count = 0; extra = 0; start += 3;}
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        IsValidSudoku isValidSudoku = new IsValidSudoku();
        Boolean bool = isValidSudoku.isValidSudoku(board);
        System.out.println(bool);
    }

}
