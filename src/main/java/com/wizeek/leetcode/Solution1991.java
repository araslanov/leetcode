package com.wizeek.leetcode;

public class Solution1991 {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int leftSum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < n; i++) {
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
