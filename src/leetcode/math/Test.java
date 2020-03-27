package leetcode.math;

public class Test {
    public static void main(String[] args) {
        int one = 0;
        int two = 27;
        Test test = new Test();
       int value = test.gcd_1(one,two);
        System.out.println(value);
        //System.out.println(one%two);
    }

    int gcd_1(int a, int b){
        return b == 0 ? a:gcd_1(b, a%b);
    }
}
