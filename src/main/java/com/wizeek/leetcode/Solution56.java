package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class Solution56 {
    public int[][] merge(int[][] intervals) {
        TreeMap<Integer, Integer> points = new TreeMap<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i < interval[1]; i++) {
                points.put(i, 1);
            }
            if (!points.containsKey(interval[1])) {
                points.put(interval[1], 0);
            }
        }
        int start = -1;
        int end = -1;
        LinkedList<int[]> list = new LinkedList<>();
        while (!points.isEmpty()) {
            Map.Entry<Integer, Integer> entry = points.pollFirstEntry();
            int key = entry.getKey();
            if (start < 0) {
                start = key;
            }
            int value = entry.getValue();
            if (value == 0) {
                end = key;
                list.add(new int[]{start, end});
                start = -1;
            }
        }
        int n = list.size();
        int[][] result = new int[n][];
        for (int i = 0; i < n; i++) {
            result[i] = list.pollFirst();
        }
        return result;
    }
}
