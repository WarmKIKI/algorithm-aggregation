package leetcode.top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// [1,3] [2,6]
public class Merge {
    public int[][] merge(int[][] intervals) {
        int count = intervals.length;
        if (count < 2) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });

        List<int[]> resultList = new ArrayList<int[]>();

        int[] merged = new int[] { intervals[0][0], intervals[0][1] };

        for (int i=1; i<intervals.length; i++) {
             int[] current = intervals[i];
             if (current[0] <= merged[1]) {
                 if (current[1] > merged[1]) {
                    merged[1] = current[1];
                }
            } else {
                resultList.add(merged);
                merged = new int[] {current[0], current[1]};
            }
        }

        resultList.add(merged);

        return resultList.toArray(new int[0][]);
    }
}
