package leetcode.sort;

import java.util.Arrays;

public class HeaoSort {
    public static int[] heapSort(int[] arr) {
        // 调整堆要从最后一个非叶子节点开始
        for (int i = arr.length/2-1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }

        //交换，再调整
        for (int i = arr.length-1; i > 0 ; i++) {
            swap(arr, 0, i); // 每次都交换二叉树的最后一个元素和第一个元素。保持二叉树最后一个元素为当前排序的最大值
            adjustHeap(arr, 0, i); // 交换之后进行从上往下依次调整
        }
        return arr;
    }

    // 交换元素
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    // 从上往下依次调整
    private static void adjustHeap(int[] arr, int i, int length) {
        int temp = arr[i];
        for (int j = i*2+1; j < length; j = j*2+1) {
            if(j+1 < length && arr[j] < arr[j+1]){ // j始终指向较大的那个子节点
                j++;
            }
            if(arr[j] > temp) { // 子节点比父节点大，则交换
                arr[i] = arr[j];
                i = j;
            } else {
                break; // 直到满足父节点大于子节点的状态，则跳出循环
            }
        }
        arr[i] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
