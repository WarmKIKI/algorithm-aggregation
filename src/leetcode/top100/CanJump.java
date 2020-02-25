package leetcode.top100;

// 动态规划

import static java.lang.Math.max;

public class CanJump {
    public boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (i > k) return false;
            k = max(k, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        CanJump canJump = new CanJump();
        boolean bool = canJump.canJump(new int[]{2,3,1,1,4});
        System.out.println(bool);
    }
}
