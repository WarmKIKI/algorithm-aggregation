package swordmeans_offer;

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        Integer min = Integer.MAX_VALUE;
        for (int elem : array) {
            if(min > elem) {
                min = elem;
            }
        }
        return min;
    }
}
