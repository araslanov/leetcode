package com.wizeek.leetcode.p53;

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = nums[0];
        int currentMax = max;
        for (int i = 1; i < nums.length; i++) {
            if (currentMax < 0) {
                currentMax = nums[i];
            } else {
                currentMax += nums[i];
            }
            if (max < currentMax) {
                max = currentMax;
            }
        }
        return max;
    }
}
