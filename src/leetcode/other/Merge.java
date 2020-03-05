package leetcode.other;

public class Merge {
    public void merge(int[] A, int m, int[] B, int n) {
        int j;
        for (int i = 0; i < n; i++) {
            for (j = 0; j < m+i; j++) {
                if(B[i] < A[j]) {
                    for (int k = m-1+i; k >= j; k--) {
                        A[k+1] = A[k];
                    }
                    A[j] = B[i];
                    break;
                }
            }
            if(j == m+i) { A[m+i] = B[i]; }
        }
    }

    public static void main(String[] args) {
        Merge merge = new Merge();
        merge.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6},3);
    }
}
