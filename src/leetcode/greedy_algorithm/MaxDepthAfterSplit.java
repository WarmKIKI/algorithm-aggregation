package leetcode.greedy_algorithm;

import java.util.Stack;

public class MaxDepthAfterSplit {
    public int[] maxDepthAfterSplit(String seq) {
        int[] answer = new int[seq.length()];
        int count = 0;
        for (int i = 0; i < seq.length(); i++) {
            char temp = seq.charAt(i);
            if(temp == '(') {
                count++;
                answer[i] = count%2;
            } else if(temp == ')') {
                answer[i] = count%2;
                count--;
            }
        }
        return answer;
    }
}
