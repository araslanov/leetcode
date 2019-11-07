package com.wizeek.leetcode.p9;

/**
 * Checking last and first digits
 */
public class Solution_2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int divisor = 1_000_000_000;
        while (x / divisor == 0) {
            divisor /= 10;
        }

        int leftNumber = 0;
        int rightNumber = 0;
        int leftDivisor = divisor;
        int rightDivisor = 10;

        while (leftDivisor >= rightDivisor) {
            leftNumber = x / leftDivisor;
            rightNumber = rightNumber * 10 + x % 10;
            if (leftNumber != rightNumber) {
                return false;
            }
            x = x / rightDivisor;
            leftDivisor /= 100;
        }

        return true;
    }
}
