package com.wizeek.leetcode;

public class Solution1762_2 {
    public int[] findBuildings(int[] h) {
        int max = Integer.MIN_VALUE;
        int n = h.length;
        int delete = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (h[i] <= max) {
                h[i] = -1;
                delete++;
            }
            max = Math.max(max, h[i]);
        }
        int[] result = new int[n - delete];
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (h[j] > 0) {
                result[i++] = j;
            }
        }
        return result;
    }
}
