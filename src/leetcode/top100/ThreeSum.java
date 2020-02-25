package leetcode.top100;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<String> arrayList = new ArrayList<>();
        Set<Set<Integer>> setSet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        for (int i = 0; i < nums.length; i++) {
            arrayList.add(String.valueOf(nums[i]));
        }
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) zero++;
            arrayList.remove(String.valueOf(nums[i]));
            for (int j = i+1; j < nums.length; j++) {
                arrayList.remove(String.valueOf(nums[j]));
                int temp = nums[i] + nums[j];
                int opt = -temp;
                if(arrayList.contains(String.valueOf(opt))) {
                    Set<Integer> hashSetSet = new HashSet<>();
                    hashSetSet.add(nums[i]);
                    hashSetSet.add(nums[j]);
                    hashSetSet.add(opt);
                    setSet.add(hashSetSet);
                }
                arrayList.add(String.valueOf(nums[j]));
            }
            arrayList.add(String.valueOf(nums[i]));
        }
        for (Set<Integer> elem : setSet) {
            List<Integer> list = new ArrayList<>(elem);
            if(list.size() == 2) {
                int temp = list.get(0) + list.get(1);
                list.add(-temp);
            }
            if(list.size() == 1) continue;
            result.add(list);
        }
        if(zero >= 3) result.add(Arrays.asList(0, 0, 0));
        return result;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        threeSum.threeSum(new int[]{0, -1, 1});
    }
}
