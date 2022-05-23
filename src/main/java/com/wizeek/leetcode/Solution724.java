package com.wizeek.leetcode;

public class Solution724 {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i < n; i++) {
            rightSum += nums[i];
        }
        if (leftSum == rightSum) {
            return 0;
        }
        for (int i = 1; i < n; i++) {
            leftSum += nums[i - 1];
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
