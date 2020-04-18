package leetcode.array;

public class test {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        test test = new test();
        test.change(matrix);
        test.print(matrix);
    }

    public void change(int[][] matrix) {
        matrix[2][2] = 1;
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
}
