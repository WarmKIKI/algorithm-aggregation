package leetcode.dynamic_drogramming;

public class MinDistance {
    public int minDistance(String word1, String word2) {
        int n = word2.length(); // 列
        int m = word1.length(); // 行
        // 记录word1[i] 转换到word[j] 需要的最少操作数
        int[][] value = new int[m+1][n+1];
        for (int i = 1; i < n+1; i++) {
            value[0][i] = value[0][i-1] + 1;
        }
        print(value);
        for (int i = 1; i < m+1; i++) {
            value[i][0] = value[i-1][0] + 1;
        }
        print(value);
        for (int i = 1; i < m+1; i++) {
            for (int j = 1; j < n+1; j++) {
                value[i][j] = word1.charAt(i-1) == word2.charAt(j-1) ? value[i-1][j-1] : Math.min(value[i][j-1] ,Math.min(value[i-1][j],value[i-1][j-1])) + 1;
            }
            print(value);
        }
        print(value);
        return value[m][n];
    }

    public void print(int[][] value) {
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < value[0].length; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        MinDistance minDistance = new MinDistance();
        System.out.println(minDistance.minDistance("intention", "execution"));
    }
}
