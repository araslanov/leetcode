package com.wizeek.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution347_2 {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Deque<Integer>> reverse = new HashMap<>();
        int c = count.size();
        int[] reps = new int[c];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            reps[i] = entry.getValue();
            reverse.computeIfAbsent(reps[i], key -> new LinkedList<>()).offerLast(entry.getKey());
            i++;
        }
        quickSelect(reps, 0, c - 1, c - k);
        int[] result = new int[k];
        int j = 0;
        for (i = c - k; i < c; i++) {
            result[j++] = reverse.get(reps[i]).pollLast();
        }
        return result;
    }

    private void quickSelect(int[] reps, int left, int right, int k) {
        int pivot = partition(reps, left, right);
        if (pivot == k) {
            return;
        } else if (pivot > k) {
            quickSelect(reps, left, pivot - 1, k);
        } else {
            quickSelect(reps, pivot + 1, right, k);
        }
    }

    private int partition(int[] reps, int left, int right) {
        int pivot = reps[left];
        int prev = right;
        for (int i = right; i >= left; i--) {
            if (reps[i] > pivot) {
                swap(reps, i, prev);
                prev--;
            }
        }
        swap(reps, left, prev);
        return prev;
    }

    private void swap(int[] reps, int i, int j) {
        int temp = reps[i];
        reps[i] = reps[j];
        reps[j] = temp;
    }
}
