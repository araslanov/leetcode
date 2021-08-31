package com.wizeek.leetcode.p121;

public class Solution2 {
    public int getMaxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        if (prices.length == 2) {
            int profit = prices[1] - prices[0];
            if (profit > 0) {
                return profit;
            } else {
                return 0;
            }
        }
        int maxProfit = 0;
        int left = 0;
        int right = prices.length - 1;
        do {
            int profit = prices[left] - prices[right];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (right - left > 1) {
                profit = prices[left + 1] - prices[right];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
                profit = prices[left] - prices[right - 1];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            left++;
            right--;
        } while (right - left > 2);
        return maxProfit;
    }
}
