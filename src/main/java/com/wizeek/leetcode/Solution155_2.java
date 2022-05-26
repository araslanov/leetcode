package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution155_2 {
    private final Deque<Integer> stack = new LinkedList<>();
    private int min = Integer.MAX_VALUE;

    public Solution155_2() {

    }

    public void push(int val) {
        stack.addFirst(val);
        min = Math.min(min, val);
    }

    public void pop() {
        int val = stack.pollFirst();
        if (val == min) {
            updateMin();
        }
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return min;
    }

    private void updateMin() {
        min = Integer.MAX_VALUE;
        for (int val : stack) {
            min = Math.min(min, val);
        }
    }
}
