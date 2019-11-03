package com.wizeek.leetcode.p7;

public class Solution {
    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        boolean negative = x < 0;
        String s = Integer.toString(x);
        int n = s.length();
        char[] result = new char[n];
        int resultIndex = 0;
        if (negative) {
            result[resultIndex++] = '-';
        }
        boolean leadingZero = true;
        for (int i = n - 1; i >= (negative ? 1 : 0); i--) {
            char currentChar = s.charAt(i);
            if (currentChar != '0' || !leadingZero) {
                leadingZero = false;
                result[resultIndex++] = currentChar;
            }
        }
        try {
            return Integer.parseInt(new String(result, 0, resultIndex));
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
