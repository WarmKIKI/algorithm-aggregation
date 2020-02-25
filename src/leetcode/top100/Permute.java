package leetcode.top100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 全排列, 间隙插入法
// [1,]
// [1,2,], [2,1]
// [1,2,3],[3,1,2],[1,3,2],[3,2,1],[2,3,1],[2,1,3]

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> integers = new ArrayList<>();
        List<List<Integer>> tmp = new ArrayList<>();
        integers.add(nums[0]);
        tmp.add(integers);
        for (int i = 1; i < nums.length; i++) {
            int size = tmp.size();
            for (int k = 0; k < size; k++) {
                List<Integer> elem = tmp.get(k);
                for (int t = 0; t <= i; t++) {
                    if(t < i) {
                        List<Integer> temp = new ArrayList<>();
                        temp.addAll(elem);
                        temp.add(t, nums[i]);
                        tmp.add(temp);
                    } else {
                        tmp.get(k).add(nums[i]);
                    }
                }
            }
        }
        return tmp;
    }

    public static void main(String[] args) {
        Permute permute = new Permute();
        List<List<Integer>> tmp = permute.permute(new int[]{1,2,3});
        System.out.println(tmp);
    }
}
