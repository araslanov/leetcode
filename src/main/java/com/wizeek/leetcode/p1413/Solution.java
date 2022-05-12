package com.wizeek.leetcode.p1413;

public class Solution {
    public int minStartValue(int[] nums) {
        int result = 1;
        int sum = result;
        for (int num : nums) {
            sum += num;
            if (sum < 1) {
                result += 1 - sum;
                sum += 1 - sum;
            }
        }
        return result;
    }
}
