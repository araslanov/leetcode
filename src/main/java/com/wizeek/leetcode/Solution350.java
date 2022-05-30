package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> first = new HashMap<>();
        for (int num : nums1) {
            first.put(num, first.getOrDefault(num, 0) + 1);
        }
        Map<Integer, Integer> second = new HashMap<>();
        for (int num : nums2) {
            second.put(num, second.getOrDefault(num, 0) + 1);
        }
        int n = 0;
        for (Map.Entry<Integer, Integer> entry : first.entrySet()) {
            int common = Math.min(entry.getValue(), second.getOrDefault(entry.getKey(), 0));
            first.put(entry.getKey(), common);
            n += common;
        }
        int[] result = new int[n];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : first.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                result[k++] = entry.getKey();
            }
        }
        return result;
    }
}
