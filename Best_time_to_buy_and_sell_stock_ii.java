import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        var n = prices.length;

        if (n <= 1) return 0;

        var buy = prices[0];
        var sell = prices[1];
        var profit = 0;

        for (int i = 0;i < n;i++) {
            sell = prices[i];
            if (sell > buy) {
                profit += sell-buy;
                buy = sell;
            } else {
                buy = Math.min(buy, prices[i]);
            }
        }
        return profit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/?envType=study-plan-v2&envId=top-interview-150