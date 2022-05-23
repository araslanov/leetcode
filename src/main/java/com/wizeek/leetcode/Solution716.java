package com.wizeek.leetcode;

import java.util.LinkedList;

public class Solution716 {
    private LinkedList<Integer> stack = new LinkedList<>();
    private int maxIndex;
    private int maxValue = Integer.MIN_VALUE;

    public Solution716() {
    }

    public void push(int x) {
        stack.addLast(x);
        if (maxValue <= x) {
            maxValue = x;
            maxIndex = stack.size() - 1;
        }
    }

    public int pop() {
        int result = stack.pollLast();
        if (result == maxValue) {
            updateMax();
        }
        return result;
    }

    public int top() {
        return stack.peekLast();
    }

    public int peekMax() {
        return maxValue;
    }

    public int popMax() {
        int max = stack.remove(maxIndex);
        updateMax();
        return max;
    }

    private void updateMax() {
        maxValue = Integer.MIN_VALUE;
        int i = 0;
        for (int value : stack) {
            if (maxValue <= value) {
                maxValue = value;
                maxIndex = i;
            }
            i++;
        }
    }
}
