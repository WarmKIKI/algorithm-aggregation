package leetcode.other;

import java.util.ArrayList;
import java.util.List;

public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        int sum = 0;
        int begin = 1;
        List<List<Integer>> arrayList = new ArrayList();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= target/2+1; i++) {
            sum += i;
            list.add(i);
            if(sum == target) {
                List temp = new ArrayList();
                temp.addAll(list);
                arrayList.add(temp);
                i = begin++;
                sum = 0;
                list.clear();
            } else if(sum > target) {
                list.clear();
                i = begin++;
                sum = 0;
            }
        }
        int[][] result = new int[arrayList.size()][];
        int i = 0, j = 0;
        for (List<Integer> elem : arrayList) {
            result[i] = new int[elem.size()];
            while(elem.size() != j) {
                result[i][j] = elem.get(j);
                j++;
            }
            i++;
            j = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        FindContinuousSequence finds = new FindContinuousSequence();
        int[][] result = finds.findContinuousSequence(9);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }

//    private void helper(int target, List<Integer> list, List<List<Integer>> arrayList) {
//        for (int i = 0; i < target; i++) {
//
//        }
//    }
}
