package com.wizeek.leetcode;

public class Solution2104 {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long result = 0;
        for (int i = 0; i < n; i++) {
            int min = nums[i];
            int max = nums[i];
            for (int j = i + 1; j < n; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                result += max - min;
            }
        }
        return result;
    }
}
