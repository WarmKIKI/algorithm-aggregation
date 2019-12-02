package leetcode.sort;

public class BubbleSort {
    public static void main(String[] args) {
      int[] arr =  bubblesort(new int[]{9,6,2,3,4,1,5,0,7,8});
        for (Integer i: arr) {
            System.out.print(i + " ");
        }
    }
    public static int[] bubblesort(int[] arr) {
        int temp;
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
