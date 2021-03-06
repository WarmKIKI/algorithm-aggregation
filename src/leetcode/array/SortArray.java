package leetcode.array;

import java.util.Arrays;

public class SortArray {
    public int[] sortArray(int[] nums) {
        quicksort(0, nums.length-1, nums);
        return nums;
    }

    public void quicksort(int r, int l, int[] nums) {
        if(r > l) return;
        int i = r, j = l, key = nums[r];
        while(i < j && nums[j] > key) j--;
        if(i < j) {
            nums[i] = nums[j];
            i++;
        }
        while (i < j && nums[i] < key) i++;
        if(i < j) {
            nums[j] = nums[i];
            j--;
        }
        nums[i] = key;
        quicksort(r, i-1, nums);
        quicksort(i+1,l,nums);
    }
}
