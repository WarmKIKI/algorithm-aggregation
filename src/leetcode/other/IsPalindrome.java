package leetcode.other;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int x) { //1234
        int y = x;
        int number = 0;
        int mod = y%10;
        while(y != 0 && y > 0) {
            number = number*10 + mod;
            y = y/10;
            mod = y%10;
        }
        if(x == number) return true;
        return false;
    }
}
