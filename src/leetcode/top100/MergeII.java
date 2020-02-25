package leetcode.top100;

public class MergeII {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i , j;
        int length = nums1.length;
        int extra = 0;
        for (i = 0, j = 0; j < n && i < m + extra; i++) {
            if(nums1[i] > nums2[j]) {
                for (int k = length - 1; k >= i;) {
                    nums1[k] = nums1[--k];
                    if(k == 0) break;
                }
                nums1[i] = nums2[j];
                extra++;
                j++;
            }
        }

        if(i == m + extra) {
            int num = n - j;
            for (int k = length - num; k < length && j < n; k++) {
                nums1[k] = nums2[j++];
            }
        }
    }

    public static void main(String[] args) {
        MergeII mergeII = new MergeII();
        mergeII.merge(new int[]{2,0}, 1, new int[]{1}, 1);
    }
}
