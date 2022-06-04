package com.wizeek.leetcode;

public class Solution338_3 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        int previousDegree = 0;
        result[0] = 0;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                result[i] = 1;
                previousDegree = i;
            } else {
                result[i] = 1 + result[i - previousDegree];
            }
        }
        return result;
    }
}
