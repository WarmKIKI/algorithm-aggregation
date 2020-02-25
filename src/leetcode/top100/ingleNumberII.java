package leetcode.top100;

import java.util.HashMap;
import java.util.Map;

public class ingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int flag = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) flag = entry.getKey();
        }
        return flag;
    }

    public static void main(String[] args) {
        ingleNumberII ins = new ingleNumberII();
        ins.singleNumber(new int[]{2,2,3,2});
    }
}
