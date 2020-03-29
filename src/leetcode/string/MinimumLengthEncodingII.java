package leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 字符串压缩编码
public class MinimumLengthEncodingII {
    public int minimumLengthEncoding(String[] words) {
        int count = 0;
        Set<String> set = new HashSet<>();
        int length = words.length;
        for (int i = 0; i < length; i++) {
            set.add(words[i]);
        }
        for (String elem : words) {
            for (int i = 1; i < elem.length(); i++) {
                set.remove(elem.substring(i));
            }
        }
        for (String elem : set) {
            count += elem.length()+1;
        }
        return count;
    }

    public static void main(String[] args) {
        MinimumLengthEncodingII min = new MinimumLengthEncodingII();
        int value = min.minimumLengthEncoding(new String[]{"time","me","bell","tall"});
        System.out.println(value);
    }
}
