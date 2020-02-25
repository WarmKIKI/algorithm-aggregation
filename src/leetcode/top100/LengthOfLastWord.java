package leetcode.top100;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int result = 0;
        if(" ".equals(s)) return 0;
        String[] strings = s.trim().split(" ");
        int length = strings.length;
        if(length != 0) {
            result = strings[length - 1].length();
        }
        return result;
    }

    public static void main(String[] args) {
        LengthOfLastWord it = new LengthOfLastWord();
        int result = it.lengthOfLastWord(" a");
        System.out.println(result);
    }
}
