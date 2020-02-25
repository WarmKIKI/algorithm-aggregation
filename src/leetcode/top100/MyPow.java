package leetcode.top100;

public class MyPow {
    public double myPow(double x, int n) {
        if(x == 1.00000) return x;
        if(n < 0) {
            n = -n;
            x = 1 / x;
        }
        double result = 1;
        for (long i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public double myPowII(double x, int n) {
        double result = Math.pow(x, n);
        return result;
    }

    public double myPowIII(double x, int n) {
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x;
        for (long i = N; i > 0; i /= 2) {
            if ((i % 2) == 1) {
                ans = ans * current_product;
            }
            current_product = current_product * current_product;
        }
        return ans;
    }

    public static void main(String[] args) {
        MyPow myPow = new MyPow();
        double result = myPow.myPowIII(2.0, 11);
        System.out.println(result);
    }
}
