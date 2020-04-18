package leetcode.greedy_algorithm;

import leetcode.math.Intersection;

public class CanJump {
    public boolean canJump(int[] nums) {
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
             if(i > step) return false;
             step = Math.max(step, nums[i] + i);
        }
        return true;
    }
}
