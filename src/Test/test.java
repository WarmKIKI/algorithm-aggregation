package Test;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            list.remove(nums[i]);
        }

        Set<Integer> set = new HashSet<>();
    }
}
