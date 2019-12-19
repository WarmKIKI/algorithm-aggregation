package swordmeans_offer;

// 负数的补码是 符号位是1，其余各位求反，末位加1
// 1/2 = 0 , 1%2 = 1
public class NumberOf1 {
    public int NumberOf1(int n) {
        if(n == 1) return 1;
        int count = 0, mod;
        if(n < 0) {
            n = n * (-1);
            n = n^Integer.MAX_VALUE + 1;
        }
        while(n != 0) {
            mod = n % 2;
            n = n / 2;
            if(mod == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOf1 number = new NumberOf1();
        System.out.println(number.NumberOf1(-2147483648));
    }
}
