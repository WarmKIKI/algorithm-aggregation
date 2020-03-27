package leetcode.math;
// 水壶问题
public class CanMeasureWater {
    public boolean canMeasureWater(int x, int y, int z) {
        int a = x % 2;
        int b = y % 2;
        int sum = x + y;
        if(z < 0 || z > sum) return false;
        // 第一种情况:两偶
        if(a==0 && b==0) {
            if(z%2 == 0) {
                return true;
            }
        } else if(a==1 && b==1) { // 第二种情况：两奇
            return true;
        } else if(Math.abs(a-b) == 1) { // 第三种情况：一奇一偶
            int small = gcd(x,y);
            if(small !=1 && (x !=1 && y != 1)) {
                for (int i = 1; i <= sum/small; i++) {
                    if(z == i*small) return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    // 任意数%1 都是 0
    public boolean canMeasureWaterII(int x, int y, int z) {
        return z == 0 || (x+y >= z && z%gcd(x,y) == 0);
    }

    public int gcd(int a, int b){
        return b == 0 ? a:gcd(b, a%b);
    }

    public static void main(String[] args) {
        CanMeasureWater can = new CanMeasureWater();
        boolean flag = can.canMeasureWater(1,2,0);
        System.out.println(flag);
    }
}
