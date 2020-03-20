package leetcode.dynamic_drogramming;

import java.util.HashMap;
import java.util.Map;

public class NumDecodings {
    public int numDecodings(String s) {
        Map<Integer, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put(i+1, (char) (65+i));
        }

        return 0;
    }

    public static void main(String[] args) {
        NumDecodings decodings = new NumDecodings();
        decodings.numDecodings("");
    }
}
