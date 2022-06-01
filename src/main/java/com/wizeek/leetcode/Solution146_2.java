package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution146_2 {
    private final int capacity;
    private final int[] cache = new int[10001];
    private final int[] useCount = new int[10001];
    private final Queue<Integer> useOrder = new LinkedList<>();

    private int size = 0;

    public Solution146_2(int capacity) {
        this.capacity = capacity;
        Arrays.fill(cache, -1);
    }

    public int get(int key) {
        int value = cache[key];
        if (value < 0) {
            return -1;
        }
        addUsage(key);
        return value;
    }

    public void put(int key, int value) {
        if (cache[key] < 0) {
            size++;
        }
        cache[key] = value;
        addUsage(key);
        if (size > capacity) {
            evict();
        }
    }

    private void addUsage(int key) {
        useOrder.offer(key);
        useCount[key]++;
    }

    private void evict() {
        Integer oldest = useOrder.poll();
        while (useCount[oldest] > 1) {
            useCount[oldest]--;
            oldest = useOrder.poll();
        }
        useCount[oldest] = 0;
        cache[oldest] = -1;
        size--;
    }
}
