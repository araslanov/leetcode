package com.wizeek.leetcode;

public class Solution1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        for (int num : nums) {
            count[num]++;
        }
        int sum = 0;
        for (int c : count) {
            if (c > 1) {
                sum += c * (c - 1) / 2;
            }
        }
        return sum;
    }
}
