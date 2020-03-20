package leetcode.top100;

import java.util.ArrayList;
import java.util.List;

public class CountCharacters {
    public int countCharacters(String[] words, String chars) {
        int count = 0;
        int charLength = chars.length();
        for (int i = 0; i < words.length; i++) {
            List<Character> list = new ArrayList();
            int length = words[i].length();

            if(charLength < length) continue;
            for (int j = 0; j < length; j++) {
                list.add(words[i].charAt(j));
            }
            for (int j = 0; j < charLength; j++) {
                if(list.contains(chars.charAt(j)) && !list.isEmpty()) {
                    list.remove(list.indexOf(chars.charAt(j)));
                }
            }
            if(list.isEmpty()) count += length;
        }
        return count;
    }
}
