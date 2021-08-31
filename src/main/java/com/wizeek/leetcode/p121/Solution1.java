package com.wizeek.leetcode.p121;

public class Solution1 {
    public int getMaxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int minPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int maxPrice = prices[j];
                int profit = maxPrice - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
