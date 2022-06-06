package com.wizeek.leetcode;

public class Solution50 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (Math.abs(x - 1) < Double.MIN_VALUE) {
            return 1;
        }
        if (Math.abs(x + 1) < Double.MIN_VALUE) {
            return n % 2 == 0 ? 1 : -1;
        }
        double result = x;
        double i = 2;
        double nAbs = Math.abs((double) n);
        while (i <= nAbs) {
            result = result * result;
            i *= 2;
        }
        for (i = i / 2; i < nAbs; i++) {
            result *= x;
        }
        return n > 0 ? result : 1 / result;
    }
}
