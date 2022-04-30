package com.wizeek.leetcode.p53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                int currentMax = 0;
                for (int k = i; k < j; k++) {
                    currentMax += nums[k];
                }
                if (currentMax > max) {
                    max = currentMax;
                }
            }
        }
        return max;
    }
}
