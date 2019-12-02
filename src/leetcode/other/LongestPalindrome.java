package leetcode.other;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("tattarrattat"));
    }
    public static String longestPalindrome(String s) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int rflag = 1, rj, rt;
            for(rj = i-1, rt = i+1; rj >= 0 && rt < s.length() && s.charAt(rj) == s.charAt(rt); rj--,rt++,rflag++);
            int lflag = 0, lt, lj;
            for (lj = i, lt = i+1; lj >= 0 && lt < s.length() && s.charAt(lj) == s.charAt(lt); lj--,lt++,lflag++);
            if(rflag > lflag && rflag > max) {
                max = rflag;
                start = rj+1;
                end = rt;
            }
            if(rflag <= lflag && lflag >= max) {
                max = lflag;
                start = lj+1;
                end = lt;
            }
        }
        return s.substring(start, end);
    }
}
