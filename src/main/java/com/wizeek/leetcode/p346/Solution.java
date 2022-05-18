package com.wizeek.leetcode.p346;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private final int window;

    private double average;
    private Queue<Integer> numbers = new LinkedList<>();

    public Solution(int size) {
        window = size;
    }

    public double next(int val) {
        numbers.offer(val);
        int newSize = numbers.size();
        if (newSize > window) {
            Integer firstValue = numbers.poll();
            if (firstValue != null) {
                average = average - firstValue * 1.0 / window + val * 1.0 / window;
            }
        } else {
            average = (average * (newSize - 1) + val) / newSize;
        }
        return average;
    }
}
