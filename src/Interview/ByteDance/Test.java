package Interview.ByteDance;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("ccc");
        set.add("abc");
        for (String s: set) {
            System.out.print(s + " ");
        }
    }
}
