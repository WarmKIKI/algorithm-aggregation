package leetcode.top100;

import java.util.*;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0){
            return new ArrayList<>();
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> res = new LinkedList<>();
        helper("", digits, 0, res, map);
        return null;

    }

    private void helper(String s, String digits, int i, List<String> res, Map<Character, String> map) {
        if(i == digits.length()) {
            res.add(s);
            return;
        }
        String letters = map.get(digits.charAt(i));
        for (int j = 0; j < letters.length(); j++) {
            helper(s+letters.charAt(j), digits, i+1, res, map);
        }
    }
}
