package leetcode.other;

public class CountSubstrings {
    public int countSubstrings(String s) {
        int cnt = 1, strSize = s.length();
        if(strSize == 0) {
            return 0;
        }
        for (int i = 1; i < strSize; i++) {
            int left = i, right = i;
            while(left >= 0 && right < strSize && s.charAt(left--) == s.charAt(right++)) {
                cnt++;
            }
            left = i - 1; right = i;
            while (left >= 0 && right < strSize && s.charAt(left--) == s.charAt(right++)) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        CountSubstrings count = new CountSubstrings();
        count.countSubstrings("aabaass");
    }
}
