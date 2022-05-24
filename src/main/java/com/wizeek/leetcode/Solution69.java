package com.wizeek.leetcode;

public class Solution69 {
    public int mySqrt(int x) {
        int n = 1;
        while (n <= x / n) {
            n++;
        }
        return n - 1;
    }
}
