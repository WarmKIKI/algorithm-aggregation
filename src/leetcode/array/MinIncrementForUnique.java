package leetcode.array;

import java.util.Arrays;

// Arrays.sort() 底层用的是归并排序
public class MinIncrementForUnique {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int length = A.length;
        int count = 0;
        for (int i = 1; i < length; i++) {
            if(A[i-1] >= A[i]) {
                count += A[i-1] - A[i] + 1;
                A[i] = A[i-1] + 1;
            }
        }
        return count;
    }

    public void quicksort(int r, int l,int[] a) {
        if(r > l) return;
        int i = r, j = l, key = a[i];
        while(i < j) {
            while(i < j && a[j] > key) j--;
            if(i < j) {
                a[i] = a[j];
                i++;
            }
            while (i < j && a[i] < key) i++;
            if(i < j) {
                a[j] = a[i];
                j--;
            }
            a[i] = key;
            quicksort(r,i-1,a);
            quicksort(i+1,l,a);
        }
    }

    public static void main(String[] args) {
        MinIncrementForUnique increment = new MinIncrementForUnique();
        int result = increment.minIncrementForUnique(new int[]{1,2,2});
        System.out.println(result);
    }
}
