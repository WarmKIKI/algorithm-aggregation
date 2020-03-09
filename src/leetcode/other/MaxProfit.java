package leetcode.other;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int gap = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int tmp = prices[j] - prices[i];
                if(gap < tmp) gap = tmp;
            }
        }
        return gap;
    }
}
