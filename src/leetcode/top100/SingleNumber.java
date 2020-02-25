package leetcode.top100;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int result = singleNumber.singleNumber(new int[]{2,1,1});
        System.out.println(result);
    }
}
