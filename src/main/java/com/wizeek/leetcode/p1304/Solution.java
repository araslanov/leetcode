package com.wizeek.leetcode.p1304;

public class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        if (n == 1) {
            return result;
        }
        int number = 1;
        for (int i = 0; i < n - 1; i += 2) {
            result[i] = -number;
            result[i + 1] = number;
            number++;
        }
        return result;
    }
}
