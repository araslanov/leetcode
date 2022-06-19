package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }
        if (i >= 0) {
            int minDiff = Integer.MAX_VALUE;
            int min = 0;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i] && nums[j] - nums[i] < minDiff) {
                    min = j;
                    minDiff = nums[j] - nums[i];
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        Arrays.sort(nums, i + 1, n);
    }
}
