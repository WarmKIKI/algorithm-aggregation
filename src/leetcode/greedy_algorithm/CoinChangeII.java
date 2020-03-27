package leetcode.greedy_algorithm;

import java.util.Arrays;

public class CoinChangeII {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {  // [1,2,5]  11
            int k = amount/coins[i]; // 11/5 = 2  1/2 = 0
            count += k;
            amount -= k*coins[i];
            if(amount == 0) break;
        }
        if(amount == 0) return count;
        else  return -1;
    }

    public static void main(String[] args) {
        CoinChangeII coin = new CoinChangeII();
        int value = coin.coinChange(new int[]{185,419,83,408}, 6249);
        System.out.println(value);
    }
}
