package leetcode.top100;

import java.util.HashSet;
import java.util.Set;

public class TestII {
    public static void main(String[] args) {
        Set<Set<Integer>> result = new HashSet<>();
        Set one = new HashSet<>();
        one.add(1);
        one.add(0);
        one.add(-1);

        Set two = new HashSet();
        two.add(1);
        two.add(0);
        two.add(-1);

        result.add(one);
        result.add(two);

        for (Set<Integer> elem : result) {
            System.out.println(elem);
        }
    }
}
