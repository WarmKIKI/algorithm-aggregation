package leetcode.sort;

import java.util.Arrays;

//public class MergeSort {
//    // 二路归并
//    public int[] merge(int[] left, int[] right) {
//        int[] result = new int[left.length + right.length];
//        int i = 0 ,j = 0, k = 0;
//        while(i < left.length && j < right.length) {
//            result[k++] = left[i] < right[j] ? left[i++] : right[j++];
//        }
//        while(i < left.length) {
//            result[k++] = left[i++];
//        }
//        while(j < right.length) {
//            result[k++] = right[j++];
//        }
//        return result;
//    }
//
//    public void mergeSort() {
//
//    }
//}

public class MergeSort {
    public static void merge(int[] a, int left, int mid, int right) {
        int[] result = new int[a.length];
        int i = left, p1 = left, p2 = right;
        while(left <= mid && right >= mid) {
            result[i++] = a[left] <= a[right] ? a[left++] : a[right--];
        }
        while(left <= mid) result[i++] = a[left++];
        while(right >= mid) result[i++] = a[right--];
        for (int j = p1; j <= p2; j++) {
            a[j] = result[j];
        }
    }

    public static void mergeSort(int[] a, int start, int end) {
        if(start < end) {
            int mid = (start + end) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid+1, end);
            merge(a, start, mid, end);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{8,4,5,6,2,3,1,7,9};
        mergeSort(a, 0, a.length);
        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}