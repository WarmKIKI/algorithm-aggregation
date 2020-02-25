package leetcode.top100;


// 设计思路：
// 从数组右侧向左开始遍历，找是否存在nums[i]>nums[i-1]的情况，
// 如果不存在这种nums[i]>nums[i-1]情况 ，
// for循环会遍历到i==0（也就是没有下一个排列），
// 此时按题意排成有序Arrays.sort()
// 如果存在，则将从下标i到nums.length()的部分排序，
// 然后在排过序的这部分中遍历找到第一个大于nums[i-1]的数，
// 并与nums[i-1]交换位置
// 1 2 3 , 1 3 2, 2 1 3, 2 3 1, 3 1 2, 3 2 1
// 3 1 2
// 1 2 3 4, 1 2 4 3, 1 3 2 4, 1 3 4 2, 1 4 2 3, 1 4 3 2
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int i;
        for (i = nums.length - 1; i > 0; i--) {
            if(nums[i-1] < nums[i]) break;
        }
        int j;
        if(i != 0) {
            for (j = i; j < nums.length; ++j) {
                if(nums[j] <= nums[i-1]) break;
            }
            int t = nums[i-1];
            nums[i-1] = nums[j-1];
            nums[j-1] = t;
        }
        int t;
        j = nums.length - 1;
        while (i < j) {
            t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            ++i;
            --j;
        }
    }
}
