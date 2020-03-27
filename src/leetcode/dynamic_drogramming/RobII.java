package leetcode.dynamic_drogramming;

public class RobII {
    public int rob(int[] nums) {
        int length = nums.length;
        int max = 0;
        if(length == 1) max = nums[0];
        max = common(0, length -1, nums, max);
        max = common(1, length, nums, max);
        return max;
    }

    public int common(int  r, int l, int[] nums, int max) {
        int[] value = new int[nums.length];
        for (int i = r; i < l; i++) {
            if(i == r || i == r+1) {
                value[i] = nums[i];
            } else if(i == r+2) {
                value[i] = nums[i] + nums[i-2];
            } else {
                value[i] = Math.max(value[i - 2], value[i - 3]) + nums[i];
            }
            max = max < value[i] ? value[i] : max;
        }
        return max;
    }


    public static void main(String[] args) {
        RobII rob = new RobII();
        rob.rob(new int[]{2});
    }
}
