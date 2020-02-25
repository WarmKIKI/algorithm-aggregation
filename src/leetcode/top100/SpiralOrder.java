package leetcode.top100;

import java.util.ArrayList;
import java.util.List;

// 1, 2, 3
// 4, 5, 6
// 7, 8, 9

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0) return list;
        int m = matrix.length; // 行
        int n = matrix[0].length;  // 列
        int i = 0, j = 0;
        int count = (Math.max(m,n) + 1)/2;
        while(i < count) {  // i 控制圈数 i = 0
            for (j = i; j < n-i-1; j++) {  // j为列, 从左往右
                list.add(matrix[i][j]);
            }
            for (j = i; j < m-i-1; j++) {  // j为行， 从上到下
                list.add(matrix[j][n-i-1]);
            }
            for (j = n-i-1; j > i; j--) {  // j为列， 从右往左
                list.add(matrix[m-i-1][j]);
            }
            for (j = m-i-1; j > i; j--) {  // j为行， 从下往上
                list.add(matrix[j][i]);
            }
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        SpiralOrder spiralOrder = new SpiralOrder();
        spiralOrder.spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
