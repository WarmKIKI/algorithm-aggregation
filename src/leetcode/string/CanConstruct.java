package leetcode.string;

import java.util.ArrayList;
import java.util.List;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        List<Character> list = new ArrayList();
        for (int i = 0; i < magazine.length(); i++) {
            list.add(magazine.charAt(i));
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Character ch = ransomNote.charAt(i);
            if(list.contains(ch)) {
                list.remove(list.indexOf(ch));
            } else {
                return false;
            }
        }
        return true;
    }
}
