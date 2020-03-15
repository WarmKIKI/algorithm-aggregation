package leetcode.other;

public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;
        int[] result = new int[length];
        int max = 1;
        for (int i = 0; i < length; i++) {
            result[i] = 1;
        }
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    result[i] = Math.max(result[j] + 1,result[i]);
                }
            }
            if(max < result[i]) max = result[i];
        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLIS lis = new LengthOfLIS();
        lis.lengthOfLIS(new int[]{4,10,4,3,8,9});
    }
}
