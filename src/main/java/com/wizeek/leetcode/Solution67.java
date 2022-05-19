package com.wizeek.leetcode;

public class Solution67 {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = 0;
        while (n - i > 0 || m - i > 0) {
            int ai = 0;
            int bi = 0;
            if (n - i > 0) {
                ai = a.charAt(n - i - 1) - '0';
            }
            if (m - i > 0) {
                bi = b.charAt(m - i - 1) - '0';
            }
            int sum = ai + bi + carry;
            carry = sum / 2;
            result.append((char) ('0' + sum % 2));
            i++;
        }
        if (carry > 0) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}
