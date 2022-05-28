package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution905_2 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        Integer[] boxed = new Integer[n];
        for (int i = 0; i < n; i++) {
            boxed[i] = nums[i];
        }
        Arrays.sort(boxed, (a, b) -> {
            int ma = a % 2;
            int mb = b % 2;
            return ma == mb ? 0 : ma == 0 ? -1 : 1;
        });
        for (int i = 0; i < n; i++) {
            nums[i] = boxed[i];
        }
        return nums;
    }
}
