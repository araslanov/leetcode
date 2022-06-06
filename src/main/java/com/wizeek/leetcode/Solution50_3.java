package com.wizeek.leetcode;

public class Solution50_3 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        double result = 1;
        while (N > 0) {
            if ((N & 1) == 1) {
                result *= x;
            }
            N >>= 1;
            x *= x;
        }
        return result;
    }
}
