package com.wizeek.leetcode.p20;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpeningParentheses(c)) {
                stack.addFirst(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char currentlyOpenedParentheses = stack.getFirst();
                if (isParenthesesMatching(currentlyOpenedParentheses, c)) {
                    stack.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpeningParentheses(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private static boolean isParenthesesMatching(char openingParentheses, char c) {
        switch (openingParentheses) {
            case '(':
                return c == ')';
            case '[':
                return c == ']';
            case '{':
                return c == '}';
            default:
                return false;
        }
    }
}
