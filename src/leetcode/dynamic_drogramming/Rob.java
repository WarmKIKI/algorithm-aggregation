package leetcode.dynamic_drogramming;

public class Rob {
    public int rob(int[] nums) {
        int length = nums.length;
        int[] value = new int[length];
        int max = 0;
        for (int i = 0; i < length; i++) {
            if(i == 0 || i == 1) {
                value[i] = nums[i];
            } else if(i == 2) {
                value[i] = nums[i] + nums[i-2];
            } else {
                value[i] = Math.max(nums[i - 2], nums[i - 3]) + nums[i];
            }
            max = max < value[i] ? value[i] : max;
        }
        return max;
    }
}
