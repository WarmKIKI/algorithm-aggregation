package leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class LastRemainingII {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int size = n;
        int k = m;
        int res, index;
        while (size != 1){
            if(k > size) {
                k = k%size;
            }
            if(k == 0) k = size;
            index = k-1;
            list.remove(index);
            size--;
            res = size - index;
            if(res >= m) k = k + m -1;
            else k = m - res;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        LastRemainingII lastRemaining = new LastRemainingII();
        lastRemaining.lastRemaining(10, 17);
    }
}
