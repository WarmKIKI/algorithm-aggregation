package leetcode.top100;

public class NumTrees {
    public int numTrees(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                nums[i] += nums[j-1] * nums[i -j];
            }
        }
        return nums[n];
    }

    public static void main(String[] args) {
        NumTrees numTrees = new NumTrees();
        int result = numTrees.numTrees(3);
        System.out.println(result);
    }
}
