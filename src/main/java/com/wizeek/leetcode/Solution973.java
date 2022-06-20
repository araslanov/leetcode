package com.wizeek.leetcode;

import java.util.PriorityQueue;

public class Solution973 {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((int[] a, int[] b) -> {
            double left = Math.sqrt(a[0] * a[0] + a[1] * a[1]);
            double right = Math.sqrt(b[0] * b[0] + b[1] * b[1]);
            return left < right ? 1 : -1;
        });
        for (int[] p : points) {
            queue.offer(p);
            if (queue.size() > k) {
                queue.poll();
            }
        }
        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            result[i] = queue.poll();
        }
        return result;
    }
}
