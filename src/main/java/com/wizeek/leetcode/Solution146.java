package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Solution146 {
    private final int capacity;
    private final Map<Integer, Integer> cache = new HashMap<>();
    private final Map<Integer, Integer> useCount = new HashMap<>();
    private final Queue<Integer> useOrder = new LinkedList<>();

    public Solution146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = cache.get(key);
        if (value == null) {
            return -1;
        }
        addUsage(key);
        return value;
    }

    public void put(int key, int value) {
        cache.put(key, value);
        addUsage(key);
        if (cache.size() > capacity) {
            evict();
        }
    }

    private void addUsage(int key) {
        useOrder.offer(key);
        useCount.put(key, useCount.getOrDefault(key, 0) + 1);
    }

    private void evict() {
        Integer oldest = useOrder.poll();
        while (useCount.get(oldest) > 1) {
            useCount.put(oldest, useCount.get(oldest) - 1);
            oldest = useOrder.poll();
        }
        useCount.remove(oldest);
        cache.remove(oldest);
    }
}
