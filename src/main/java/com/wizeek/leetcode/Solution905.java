package com.wizeek.leetcode;

public class Solution905 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
                continue;
            }
            if (nums[right] % 2 == 1) {
                right--;
                continue;
            }
            nums[left] += nums[right];
            nums[right] = nums[left] - nums[right];
            nums[left] -= nums[right];
            left++;
            right--;
        }
        return nums;
    }
}
