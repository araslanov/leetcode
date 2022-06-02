package com.wizeek.leetcode;

import java.util.*;

public class Solution56_2 {
    public int[][] merge(int[][] intervals) {
        Map<Integer, Integer> points = new HashMap<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i < interval[1]; i++) {
                points.put(i, 1);
            }
            if (!points.containsKey(interval[1])) {
                points.put(interval[1], 0);
            }
        }
        List<Integer> keys = new ArrayList<>(points.keySet());
        Collections.sort(keys);
        int start = -1;
        int end = -1;
        LinkedList<int[]> list = new LinkedList<>();
        for (Integer key : keys) {
            if (start < 0) {
                start = key;
            }
            int value = points.get(key);
            if (value == 0) {
                end = key;
                list.add(new int[]{start, end});
                start = -1;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
