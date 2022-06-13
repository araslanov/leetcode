package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution71 {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Deque<String> stack = new LinkedList<>();
        for (String s : split) {
            if (".".equals(s)) {
                continue;
            } else if ("..".equals(s)) {
                stack.pollLast();
            } else if (!s.isEmpty()) {
                stack.offerLast(s);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append("/");
            result.append(stack.pollFirst());
        }
        return result.length() == 0 ? "/" : result.toString();
    }
}
