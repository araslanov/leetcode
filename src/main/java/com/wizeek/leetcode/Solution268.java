package com.wizeek.leetcode;

public class Solution268 {
    public int missingNumber(int[] nums) {
        boolean[] isThere = new boolean[nums.length + 1];
        for (int num : nums) {
            isThere[num] = true;
        }
        for (int i = 0; i < isThere.length; i++) {
            if (!isThere[i]) {
                return i;
            }
        }
        return 0;
    }
}
