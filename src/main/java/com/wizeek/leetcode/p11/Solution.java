package com.wizeek.leetcode.p11;

public class Solution {
    public int maxArea(int[] height) {
        int size = height.length;
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int minHeight = Math.min(height[i], height[j]);
                max = Math.max(max, (j - i) * minHeight);
            }
        }
        return max;
    }
}
