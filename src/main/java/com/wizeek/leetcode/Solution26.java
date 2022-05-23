package com.wizeek.leetcode;

public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }
}
