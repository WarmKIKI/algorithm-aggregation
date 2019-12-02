package leetcode.other;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatSubString {
    public static void main(String[] args) {
        lengthOfLongestSubstring(" ");
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            Set set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                Character c = s.charAt(j);
                if(!set.contains(c)) {
                    set.add(c);
                } else {
                    int value = set.size();
                    if(value > max) {
                        max = value;
                    }
                    break;
                }
            }
            if(set.size() > max) {
                max = set.size();
            }
        }
        return max;
    }
}
