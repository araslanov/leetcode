package com.wizeek.leetcode.p121;

public class Solution2 {
    public int getMaxProfit(int[] prices) {
        int currentMin = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMaxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < currentMin) {
                currentMin = prices[i];
                currentMax = prices[i];
            } else if (prices[i] > currentMax) {
                currentMax = prices[i];
                int currentProfit = currentMax - currentMin;
                if (currentProfit > currentMaxProfit) {
                    currentMaxProfit = currentProfit;
                }
            }
        }
        return currentMaxProfit;
    }
}
