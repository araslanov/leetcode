package com.wizeek.leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class Solution703 {
    private final int k;
    private final Queue<Integer> queue;

    public Solution703(int k, int[] nums) {
        this.k = k;
        queue = new PriorityQueue<>(k);
        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        if (queue.size() < k) {
            queue.offer(val);
        } else {
            if (val > queue.peek()) {
                queue.poll();
                queue.offer(val);
            }
        }
        return queue.peek();
    }
}
