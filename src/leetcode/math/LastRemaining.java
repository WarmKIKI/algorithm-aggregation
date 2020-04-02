package leetcode.math;

import java.util.ArrayList;
import java.util.List;

public class LastRemaining {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int size = list.size();
        int k = -1;
        while (size != 1){
            int count = 0;
            while(count != m) {
                count++;
                k++;
                if(k == size) k = 0;
            }
            list.remove(k);
            size--;
            k--;
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        LastRemaining lastRemaining = new LastRemaining();
        lastRemaining.lastRemaining(5, 3);
    }

}
