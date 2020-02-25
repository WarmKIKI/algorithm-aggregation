package leetcode.top100;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length - count;) {
            if(nums[i] == val) {
                count++;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                }
            } else {
                i++;
            }
        }
        return nums.length - count;
    }

    public static void main(String[] args) {
        int[] tmp = new int[]{0,1,2,2,3,0,4,2};
        RemoveElement removeElement = new RemoveElement();
        int amt = removeElement.removeElement(tmp, 2);
        System.out.println(amt);
    }
}
