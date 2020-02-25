package leetcode.top100;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if(haystack.equals("") && needle.equals("")) return 0;
        if(haystack.equals(needle)) return 0;
        if(haystack.length() != 0 && needle.length() != 0
                && haystack.substring(0, haystack.length()-1).equals(needle.substring(0, needle.length()-1))) {
            if(!haystack.substring(0).equals(needle.substring(0))) {
                return -1;
            }
        }
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = i; j < haystack.length(); j++) {
                String str = haystack.substring(i,j);
                if(str.length() > needle.length()) break;
                if(str.equals(needle)) {
                    return j - needle.length();
                }
                if(j == haystack.length()-1 && haystack.substring(i).equals(needle)) {
                    return j - needle.length() + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        StrStr strStr = new StrStr();
        int result = strStr.strStr("a", "a");
        System.out.println(result);
    }
}
