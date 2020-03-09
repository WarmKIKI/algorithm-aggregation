package leetcode.top100;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            } else map.put(nums[i] , map.get(nums[i])+1);
        }
        int MAX = Integer.MIN_VALUE;
        int key = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if(value > MAX) {
                MAX = value;
                key = entry.getKey();
            }
        }
        return key;
    }
}
