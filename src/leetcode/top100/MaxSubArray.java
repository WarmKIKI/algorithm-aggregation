package leetcode.top100;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int sum;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
}
