package com.wizeek.leetcode.p9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }

        int xOriginal = x;
        int reversed = 0;
        int digit;

        while (x > 0) {
            digit = x % 10;
            if ((Integer.MAX_VALUE - digit) / 10 < reversed) {
                return false;
            }
            reversed = 10 * reversed + digit;
            x = x / 10;
        }

        return xOriginal == reversed;
    }
}
