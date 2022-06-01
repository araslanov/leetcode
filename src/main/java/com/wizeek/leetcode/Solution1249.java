package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution1249 {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        Queue<Integer> delete = new LinkedList<>();
        Deque<Integer> opening = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!isParentheses(c)) {
                continue;
            }
            if (c == '(') {
                opening.offerLast(i);
            } else {
                if (opening.isEmpty()) {
                    delete.offer(i);
                } else {
                    opening.pollLast();
                }
            }
        }
        for (int i : opening) {
            delete.offer(i);
        }
        StringBuilder result = new StringBuilder();
        Integer del = delete.poll();
        for (int i = 0; i < n; i++) {
            if (del != null && del == i) {
                del = delete.poll();
                continue;
            }
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    private boolean isParentheses(char c) {
        return c == '(' || c == ')';
    }
}
