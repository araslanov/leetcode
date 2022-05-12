package com.wizeek.leetcode.p70;

public class Solution {
    public int climbStairs(int n) {
        double result = 1;
        for (int numberOf2 = 1; numberOf2 <= n / 2; numberOf2++) {
            int numberOf1 = n - 2 * numberOf2;
            result += partialFactorial(numberOf1 + 1, numberOf1 + numberOf2) / factorial(numberOf2);
        }
        return (int) result;
    }

    private static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static double partialFactorial(int start, int end) {
        double result = 1;
        for (int i = start; i <= end; i++) {
            result *= i;
        }
        return result;
    }
}
