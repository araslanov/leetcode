package com.wizeek.leetcode;

public class Solution231_3 {
    public boolean isPowerOfTwo(int n) {
        if (n < 1) {
            return false;
        }
        return (n & (-n)) == n;
    }
}
