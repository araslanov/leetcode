package com.wizeek.leetcode;

public class Solution227_3 {
    public int calculate(String s) {
        int current = 0;
        int n = s.length();
        char previousOperation = '+';
        int result = 0;
        int previousNumber = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ' && i < n - 1) {
                continue;
            }
            if (Character.isDigit(c)) {
                current = 10 * current + c - '0';
                if (i < n - 1) {
                    continue;
                }
            }
            if (previousOperation == '+') {
                result += previousNumber;
                previousNumber = current;
            } else if (previousOperation == '-') {
                result += previousNumber;
                previousNumber = -current;
            } else if (previousOperation == '*') {
                previousNumber *= current;
            } else {
                previousNumber /= current;
            }
            previousOperation = c;
            current = 0;
        }
        result += previousNumber;
        return result;
    }
}
