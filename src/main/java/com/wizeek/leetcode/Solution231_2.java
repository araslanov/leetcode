package com.wizeek.leetcode;

public class Solution231_2 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n > 1) {
            if (n % 2 > 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
}
