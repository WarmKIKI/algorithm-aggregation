package Interview.ByteDance;

public class BinarySearchMax {
    public int  binarySearchMax(int[] data, int target) {
        int left = 0;
        int right = data.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (data[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        if (data[right] == target)
            return right;
        return -1;
    }
    public static void main(String[] args) {
        int[] num = new int[]{0,1,2,3,4};
        int target = 3;
        BinarySearchMax binarySearchMax = new BinarySearchMax();
        int result =  binarySearchMax.binarySearchMax(num, target);
        System.out.println(result);
    }
}
