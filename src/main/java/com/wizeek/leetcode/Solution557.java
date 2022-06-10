package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution557 {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                while (!stack.isEmpty()) {
                    sb.append(stack.pollLast());
                }
                sb.append(c);
            } else {
                stack.offerLast(c);
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
