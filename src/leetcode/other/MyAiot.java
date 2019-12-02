package leetcode.other;

public class MyAiot {
    public int myAtoi(String str) {
        str = str.trim();
        long number = 0;
        boolean flag = false;
        boolean first = true;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(c == '-' && first == true) {
                flag = true;
                first = false;
                continue;
            } else if (c == '+' && first == true) {
                first = false;
                continue;
            }
            if(c <= '9' && c >= '0') {
                number = number * 10 + (c - 48);
            } else {
                break;
            }
        }
        if(flag == true) {
            number = number * (-1);
            if(number < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } else {
                return (int)number;
            }
        }
        if(number > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return (int) number;
        }
    }
}
