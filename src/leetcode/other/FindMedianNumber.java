package leetcode.other;

import java.util.Collections;

public class FindMedianNumber {
    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums2.length == 0) {
            if(nums1.length % 2 == 0) {
                return (nums1[nums1.length/2] + nums1[nums1.length/2 - 1])  / 2.0;
            } else {
                return nums1[nums1.length/2];
            }
        } else if (nums1.length == 0){
            if(nums2.length % 2 == 0) {
                return (nums2[nums2.length/2] + nums2[nums2.length/2 - 1]) / 2.0;
            } else {
                return nums2[nums2.length/2];
            }
        }
        int length = nums1.length + nums2.length;
        int[] fin = new int[length];
        int t = 0, i = 0, j = 0;
        double mid = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                fin[t++] = nums1[i];
                i++;
            } else if(nums1[i] > nums2[j]){
                fin[t++] = nums2[j];
                j++;
            } else {
                fin[t++] = nums1[i];
                fin[t++] = nums2[j];
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            fin[t++] = nums1[i];
            i++;
        }
        while (j < nums2.length) {
            fin[t++] = nums2[j];
            j++;
        }
        if(length % 2 == 0) {
            mid = (fin[length/2] + fin[length/2 - 1]) / 2.0;
        } else {
            mid = fin[length/2];
        }
        return mid;
    }
}
