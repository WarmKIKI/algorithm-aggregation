package leetcode.top100;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int temp = digits[length - 1] + 1;
        digits[length - 1] += 1;
        int i = length - 1;
        int vod = 0;
        int mod;
        if(temp == 10) {
            while (i >= 0) {
                temp = digits[i] + vod;
                mod = temp % 10;
                vod = temp / 10;
                digits[i] = mod;
                i--;
            }
        }
        if(vod != 0) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = vod;
            for (int j = 1, k = 0; j < newDigits.length && k < digits.length; j++, k++) {
                newDigits[j] = digits[k];
            }
            return newDigits;
        }
        return digits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        plusOne.plusOne(new int[]{9});
    }

}
