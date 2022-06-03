package com.wizeek.leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Solution1762 {
    public int[] findBuildings(int[] h) {
        Deque<Integer> result = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        int n = h.length;
        for (int i = n - 1; i >= 0; i--) {
            if (h[i] > max) {
                result.offerFirst(i);
            }
            max = Math.max(max, h[i]);
        }
        int l = result.size();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = result.pollFirst();
        }
        return arr;
    }
}
