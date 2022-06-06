package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - k];
    }
}
