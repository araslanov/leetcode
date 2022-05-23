package com.wizeek.leetcode;

import java.util.LinkedList;

public class Solution716 {
    private LinkedList<Integer> stack = new LinkedList<>();

    public Solution716() {

    }

    public void push(int x) {
        stack.addFirst(x);
    }

    public int pop() {
        return stack.pollFirst();
    }

    public int top() {
        return stack.peekFirst();
    }

    public int peekMax() {
        int max = Integer.MIN_VALUE;
        for (int value : stack) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public int popMax() {
        int max = Integer.MIN_VALUE;
        for (int value : stack) {
            if (max < value) {
                max = value;
            }
        }
        stack.removeFirstOccurrence(max);
        return max;
    }
}
