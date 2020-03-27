package leetcode.greedy_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 找零钱
public class CoinChange {
    int ans = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        //coinChange(coins.length-1, coins, 0, amount);
        helper(coins, amount, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private void helper(int[] coins, int amount, int count) {
        if(amount == 0) {
            ans = Math.min(ans, count);
            return;
        }
        if(amount < 0) return;
        for (int i = coins.length - 1; i >= 0; i--) {
            helper(coins, amount - coins[i], ++count);
            count--;
        }
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
        CoinChange coin = new CoinChange();
        int value = coin.coinChange(new int[]{186,419,83,408}, 6249); // 5+5+5+2+1
        System.out.println(value);
    }

}
