package leetcode.array;

public class Trap {
    public int trap(int[] height) {
        boolean flag = false;
        int i = 0;
        while(height[i] == 0) i++;
        while (i < height.length) {
            if(height[i] > height[i-1]) {

            }
            i++;
        }
        return 0;
    }
}
