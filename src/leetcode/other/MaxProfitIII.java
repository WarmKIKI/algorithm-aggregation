package leetcode.other;
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
//注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
// 根据题意，当天售出，当天可以购买
// 7 1 5 6 --> 最大利润为 6 - 1 = 5 ，5 - 1 + 6 - 5 = 5
//  所以只要当天比前一天大 就可以售出 然后再接着买入
public class MaxProfitIII {  // 7 1 5 3 6 4
    public int maxProfit(int[] prices) {
        int tmp = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(tmp > prices[i]){
                tmp = prices[i];
            } else if(prices[i] > tmp){
                profit += prices[i] - tmp;
                tmp = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        MaxProfitIII maxProfit = new MaxProfitIII();
        System.out.println(maxProfit.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
