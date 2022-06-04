package com.wizeek.leetcode;

public class Solution338_2 {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = getBits(i);
        }
        return result;
    }

    private int getBits(int n) {
        int result = 0;
        while (n > 0) {
            result += n & 1;
            n = n >> 1;
        }
        return result;
    }
}
