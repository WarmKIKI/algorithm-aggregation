package leetcode.other;

import java.util.HashMap;

public class FirstUniqChar {
    public int firstUniqChar(String s) {
        int first = Integer.MAX_VALUE;
        HashMap<Character, Integer> map = new HashMap();
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
                first = i;
            }
        }
        return i;
    }
}
