import java.lang.Math;

class Solution {
    public int maxProfit(int[] prices) {
        var n = prices.length;
        var maxProfit = 0;
        var currProfit = 0;
        var minPrice = Integer.MAX_VALUE;

        for (int i = 0;i < n;i++) {
            minPrice = Math.min(prices[i], minPrice);
            currProfit = prices[i] - minPrice;
            maxProfit = Math.max(currProfit, maxProfit);
        }
        return maxProfit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150