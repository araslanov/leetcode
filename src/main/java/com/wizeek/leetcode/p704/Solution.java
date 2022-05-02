package com.wizeek.leetcode.p704;

public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            int guess = nums[middle];
            if (guess < target) {
                start = middle + 1;
            } else if (guess > target) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
