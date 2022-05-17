package com.wizeek.leetcode.p977;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];
        int i = 0;
        int j = size - 1;
        int k = size - 1;
        while (i <= j) {
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            if (left <= right) {
                result[k--] = right;
                j--;
            } else {
                result[k--] = left;
                i++;
            }
        }
        return result;
    }
}
