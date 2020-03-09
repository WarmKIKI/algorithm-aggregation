package leetcode.other;

import java.util.Arrays;

public class CoinChange {
    int ans = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        coinChange(coins.length-1, coins, 0, amount);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private void coinChange(int index, int[] coins, int count, int needAmount) {
        if (needAmount == 0) {
            ans = Math.min(count, ans);
            return;
        }
        if (index < 0) {
            return;
        }

        int i = needAmount / coins[index];
        for (int k=i; k>=0 && count+k<ans; k--) {
            coinChange(index-1, coins, count+k, needAmount-k*coins[index]);
        }
    }

    public static void main(String[] args) {
        CoinChange coinChange = new CoinChange();
        coinChange.coinChange(new int[]{1,2,5}, 11);
    }

}
