package leetcode.top100;

import java.util.*;

// 1,1,2
// 1,2,1
// 2,1,1

// [1]
// [1,1] [1,1]
// [2,1,1] [1,2,1] [1,1,2]

public class PermuteUnique {

    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> result = new LinkedList<>();
         List<Integer> tmp = new LinkedList<>();
         tmp.add(nums[0]);
         result.add(tmp);
         for (int i = 1; i < nums.length; i++) {
             int length = result.size();
             for (int j = 0; j < length; j++) {
                 for (int k = 0; k <= i; k++) {
                     if(k < i) {
                         List<Integer> temp = new ArrayList<>();
                         temp.addAll(result.get(j));
                         temp.add(k, nums[i]);
                         result.add(temp);
                         duplicate(result, result.size()-1);
                     } else {
                         result.get(j).add(nums[i]);
                         duplicate(result, j);
                     }
                 }
             }
         }
         return result;
    }

    public void duplicate(List<List<Integer>> result, int j) {
        List<Integer> list = result.get(j);
        for (int l = 0; l < result.size(); l++) {
            List<Integer> elem = result.get(l);
            if(l == j) continue;
            int n = 0;
            while(n < list.size()) {
                if(elem.size() < list.size()) break;
                if(list.get(n) == elem.get(n)) {
                    n++;
                } else break;
            }
            if(n == list.size()) {
                if(l > j) result.remove(l);
                else result.remove(j);
                break;
            }
        }
    }

    public static void main(String[] args) {
        PermuteUnique permuteUnique = new PermuteUnique();
        List<List<Integer>> lists = permuteUnique.permuteUnique(new int[]{3,3,0,3});
        System.out.println(lists);
    }
}
