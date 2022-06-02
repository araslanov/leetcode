package com.wizeek.leetcode;

public class Solution1570 {
    final int[] nums;

    Solution1570(int[] nums) {
        this.nums = nums;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(Solution1570 vec) {
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            sum += nums[i] * vec.nums[i];
        }
        return sum;
    }
}
