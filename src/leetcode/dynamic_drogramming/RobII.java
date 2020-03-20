package leetcode.dynamic_drogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RobII {
    public int rob(int[] nums) {
        int length = nums.length;
        int[] value = new int[length];
        int max = 0;
        if(length == 1) max = nums[0];
        for (int i = 0; i < length - 1; i++) {
            if(i == 0 || i == 1) {
                value[i] = nums[i];
            } else if(i == 2) {
                value[i] = nums[i] + nums[i-2];
            } else {
                value[i] = Math.max(value[i - 2], value[i - 3]) + nums[i];
            }
            max = max < value[i] ? value[i] : max;
        }
        for (int i = 1; i < length; i++) {
            if(i == 1 || i == 2) {
                value[i] = nums[i];
            } else if(i == 3) {
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
