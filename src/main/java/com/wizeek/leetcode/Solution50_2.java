package com.wizeek.leetcode;

public class Solution50_2 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        long N = n;
        if (N < 0) {
            N = -N;
            x = 1 / x;
        }
        double half = myPow(x, (int) (N / 2));
        if (N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
