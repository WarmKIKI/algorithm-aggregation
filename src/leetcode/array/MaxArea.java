package leetcode.array;

// 盛最多水的容器
public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0, i = 0, j = height.length - 1;
        while(i < j) {
            int area =  height[i] > height[j] ? (j-i) * height[j--] : (j-i) * height[i++];
            max = area > max ? area : max;
        }
        return max;
    }
}
