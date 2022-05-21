package com.wizeek.leetcode;

public class Solution191_2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        int mask = 1;
        for (int i = 1; i <= 32; i++) {
            if ((n & mask) != 0) {
                result++;
            }
            mask <<= 1;
        }
        return result;
    }
}
