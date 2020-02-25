package leetcode.top100;

import static java.lang.Math.max;

public class CanJumpII {
    public int jump(int[] nums) {
        int maxPosition = 0;
        int end = 0;
        int step = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = max(maxPosition, nums[i] + i);
            if(i == end) {
                end = maxPosition;
                step++;
            }
        }
        return step;
    }

    public static void main(String[] args) {
        CanJumpII canJumpII = new CanJumpII();
        int result = canJumpII.jump(new int[]{1,2,1,1,1});
        System.out.println(result);
    }
}
