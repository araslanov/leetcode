package com.wizeek.leetcode.p7;

public class Solution_2 {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int currentDigit = x % 10;
            if (result > 0 && result > (Integer.MAX_VALUE - currentDigit) / 10
                    || result < 0 && result < (Integer.MIN_VALUE - currentDigit) / 10) {
                return 0;
            }
            result = result * 10 + currentDigit;
            x = x / 10;
        }

        return result;
    }
}
