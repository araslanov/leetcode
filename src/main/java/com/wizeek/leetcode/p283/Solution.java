package com.wizeek.leetcode.p283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int z = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                z++;
            } else if (z > 0) {
                nums[i - z] = nums[i];
                nums[i] = 0;
            }
            i++;
        }
    }
}
