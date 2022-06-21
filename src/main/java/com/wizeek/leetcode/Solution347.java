package com.wizeek.leetcode;

import java.util.*;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        Map<Integer, List<Integer>> reverse = new HashMap<>();
        int[] reps = new int[n];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            reverse.computeIfAbsent(entry.getValue(), key -> new LinkedList<>()).add(entry.getKey());
            reps[i++] = entry.getValue();
        }
        Arrays.sort(reps);
        int[] result = new int[k];
        for (i = 0; i < k; ) {
            List<Integer> list = reverse.get(reps[n - i - 1]);
            for (Integer e : list) {
                result[i++] = e;
            }
        }
        return result;
    }
}
