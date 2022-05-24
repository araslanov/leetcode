package com.wizeek.leetcode;

public class Solution268_2 {
    public int missingNumber(int[] nums) {
        int numSum = 0;
        int indexSum = 0;
        for (int i = 0; i < nums.length; i++) {
            numSum += nums[i];
            indexSum += i;
        }
        return indexSum + nums.length - numSum;
    }
}
