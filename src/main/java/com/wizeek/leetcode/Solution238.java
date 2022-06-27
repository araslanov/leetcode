package com.wizeek.leetcode;

public class Solution238 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int zeros = 0;
        double product = 1.0;
        int zeroIndex = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeros++;
                zeroIndex = i;
                if (zeros > 1) {
                    return result;
                }
            } else {
                product *= nums[i];
            }
        }
        if (zeroIndex >= 0) {
            result[zeroIndex] = (int) product;
            return result;
        }
        for (int i = 0; i < n; i++) {
            result[i] = (int) (product * Math.pow(nums[i], -1));
        }
        return result;
    }
}
