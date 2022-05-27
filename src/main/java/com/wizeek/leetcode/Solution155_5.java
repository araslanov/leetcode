package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution155_5 {
    private final Deque<Integer> stack = new LinkedList<>();
    private final Deque<Integer> minStack = new LinkedList<>();

    public Solution155_5() {
    }

    public void push(int val) {
        stack.addFirst(val);
        if (minStack.isEmpty() || val <= minStack.peekFirst()) {
            minStack.addFirst(val);
        }
    }

    public void pop() {
        int value = stack.pollFirst();
        if (value == minStack.peekFirst()) {
            minStack.pollFirst();
        }
    }

    public int top() {
        return stack.peekFirst();
    }

    public int getMin() {
        return minStack.peekFirst();
    }
}
