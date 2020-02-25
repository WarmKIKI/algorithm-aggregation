package leetcode.top100;

import java.util.ArrayList;
import java.util.List;

// 1,2,3,4
// []
// [1]、[2]、[3]、[4]
// [1,2]、[1,3]、[1,4]、[2,3]、[2,4]、[3,4]
// [1,2,3]、[1,2,4]、[1,3,4]、[2,3,4]
// [1,2,3,4]

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(temp);
        for (int i = 0; i < nums.length; i++) {
            temp = new ArrayList<>();;
            temp.add(nums[i]);
            result.add(temp);
        }
        int count = 0;
        int length = result.size();
        for (int i = 1; i < length + count; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.addAll(result.get(i));
            int cur = tmp.get(tmp.size()-1);
            int index = find(cur, nums);
            for (int j = index + 1; j < nums.length; j++) {
                List<Integer> list = new ArrayList<>();
                list.addAll(tmp);
                list.add(nums[j]);
                result.add(list);
                count++;
            }
        }
        return result;
    }

    private int find(int cur, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == cur) return i;
        }
        return 0;
    }

    public static void main(String[] args) {
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(new int[]{1,2,3,4});
        for (List<Integer> elem : result) {
            System.out.println(elem);
        }
    }
}
