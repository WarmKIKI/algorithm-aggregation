package leetcode.top100;

public class ClimbStair {
    public int climbStairs(int n) {
        return climb_Stairs(0, n);
    }

    public int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

    public static void main(String[] args) {
        ClimbStair climbStair = new ClimbStair();
        System.out.println(climbStair.climbStairs(4));
    }
}
