package swordmeans_offer;

import java.util.HashSet;
import java.util.Set;

//数组中重复的数字
/*在一个长度为 n 的数组里的所有数字都在 0 到 n-1 的范围内。
        数组中某些数字是重复的，但不知道有几个数字是重复的，也不知道每个数字重复几次。
        请找出数组中任意一个重复的数字。*/
/*判断一个数组是否为空，可以通过长度 length == 0*/
public class RepeatWordInArray {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers == null || length == 0) return false;
        Set set = new HashSet();
        for (int elem : numbers) {
            if(set.contains(elem)) {
                duplication[0] = elem;
                return true;
            } else {
                set.add(elem);
            }
        }
        return false;
    }
}
