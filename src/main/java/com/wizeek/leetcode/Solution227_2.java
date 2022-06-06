package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution227_2 {
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int current = 0;
        int n = s.length();
        char previousOperation = '+';
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
                stack.offerLast(current);
            } else if (previousOperation == '-') {
                stack.offerLast(-current);
            } else if (previousOperation == '*') {
                int product = stack.pollLast() * current;
                stack.offerLast(product);
            } else {
                int quotient = stack.pollLast() / current;
                stack.offerLast(quotient);
            }
            previousOperation = c;
            current = 0;
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pollLast();
        }
        return result;
    }
}
