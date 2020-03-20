package leetcode.string;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        int count = 0;
        int max = 0;
        for (Map.Entry<Character, Integer> elem : map.entrySet()) {
            int value = elem.getValue();
            if(value % 2 == 0) {
                count += value;
            } else {
                max = max < value ? value : max;
            }
        }
        return count + max;
    }
}
