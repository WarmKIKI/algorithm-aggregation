package leetcode.sort;

import leetcode.math.GetPermutation;
// leetcode 40 最小的k个数
public class GetLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] result = new int[k];
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i; j++) {
                if(arr[j] > arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
            result[i] = arr[length-i-1];
            if(i == k-1) break;
        }
        return result;
    }

    public int[] getLeastNumbersII(int[] arr, int k) {
        quickSort(arr, 0, arr.length - 1, true);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public void quickSort(int a[], int l, int r, boolean flag) {
        if(l>r) {
            return;
        }
        int mid = (l+r)/2;
        int i = l; int j = r; int key = a[mid];
        while (i<j) {
            while (i<j && a[j] > key) j--;
            if(i<j) {
                if(flag == true){
                    a[mid] = a[j];
                    flag = false;
                } else a[i] = a[j];
                i++;
            }
            while(i<j && a[i] < key) i++;
            if(i<j) {
                a[j] = a[i];
                j--;
            }
        }
        a[i] = key;
        quickSort(a,i+1,r,true);
        quickSort(a,l,i-1,true);
    }

    public static void main(String[] args) {
        GetLeastNumbers getLeastNumbers = new GetLeastNumbers();
        getLeastNumbers.getLeastNumbersII(new int[]{3,2,1,4,4,6,1,2,0}, 2);
    }
}
