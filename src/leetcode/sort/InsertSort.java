package leetcode.sort;

public class InsertSort {
    public static void main(String[] args) {
       int[] arr = insertsort(new int[]{9,3,2,4,5,1,6,8,0,7});
        for (Integer i: arr) {
            System.out.println(i);
        }
    }
    public static int[] insertsort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }
}
