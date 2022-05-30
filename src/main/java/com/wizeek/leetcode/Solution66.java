package com.wizeek.leetcode;

public class Solution66 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        int i = n - 1;
        while (carry > 0 && i >= 0) {
            carry = (digits[i] + 1) / 10;
            digits[i] = (digits[i] + 1) % 10;
            i--;
        }
        if (carry > 0) {
            int[] result = new int[n + 1];
            System.arraycopy(digits, 0, result, 1, n);
            result[0] = 1;
            return result;
        }
        return digits;
    }
}
