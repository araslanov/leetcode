package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution682 {
    public int calPoints(String[] ops) {
        int result = 0;
        Deque<Integer> stack = new LinkedList<>();
        for (String op : ops) {
            if ("+".equals(op)) {
                int last = stack.pollLast();
                int prev = stack.peekLast();
                int sum = last + prev;
                stack.offerLast(last);
                stack.offerLast(sum);
                result += sum;
            } else if ("C".equals(op)) {
                result -= stack.pollLast();
            } else if ("D".equals(op)) {
                int doubled = 2 * stack.peekLast();
                stack.offerLast(doubled);
                result += doubled;
            } else {
                int num = Integer.parseInt(op);
                stack.offerLast(num);
                result += num;
            }
        }
        return result;
    }
}
