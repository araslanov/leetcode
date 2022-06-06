package com.wizeek.leetcode;

import java.util.LinkedList;

public class Solution705 {
    private final LinkedList<Integer>[] buckets = new LinkedList[16];

    public Solution705() {
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }
        int bucket = key % 16;
        if (buckets[bucket] == null) {
            buckets[bucket] = new LinkedList<>();
        }
        buckets[bucket].add(key);
    }

    public void remove(int key) {
        if (!contains(key)) {
            return;
        }
        int bucket = key % 16;
        buckets[bucket].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int bucket = key % 16;
        if (buckets[bucket] == null) {
            return false;
        }
        for (Integer value : buckets[bucket]) {
            if (value == key) {
                return true;
            }
        }
        return false;
    }
}
