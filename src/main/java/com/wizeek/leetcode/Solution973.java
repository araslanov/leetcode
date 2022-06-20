package com.wizeek.leetcode;

import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(this::compare);
        for (int[] p : points) {
            if (queue.size() < k) {
                queue.offer(p);
            } else {
                if (compare(p, queue.peek()) > 0) {
                    queue.poll();
                    queue.offer(p);
                }
            }
        }
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }

    private int compare(int[] a, int[] b) {
        double left = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
        double right = Math.sqrt(b[0] * b[0] + b[1] * b[1]);
        return left < right ? 1 : -1;
    }
}
