package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution155 {
    private final Deque<Integer> stack = new LinkedList<>();

    public Solution155() {

    }

    public void push(int val) {
        stack.addFirst(val);
    }

    public void pop() {
        stack.pollFirst();
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int val : stack) {
            min = Math.min(val, min);
        }
        return min;
    }
}
