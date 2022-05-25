package com.wizeek.leetcode;

public class Solution231 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        String binary = Integer.toBinaryString(n);
        int ones = 0;
        for (char digit : binary.toCharArray()) {
            if (digit == '1') {
                if (++ones > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
