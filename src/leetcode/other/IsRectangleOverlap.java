package leetcode.other;

public class IsRectangleOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if(rec2[0] < rec1[2] && rec1[1] < rec2[3]) {
            return true;
        }else if(rec1[0] < rec2[2] && rec2[1] < rec1[3] ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IsRectangleOverlap is = new IsRectangleOverlap();
        is.isRectangleOverlap(new int[]{4,4,14,7}, new int[]{4,3,8,8});
    }
}
