package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class Solution56_3 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        LinkedList<int[]> result = new LinkedList<>();
        for (int[] i : intervals) {
            if (result.isEmpty()) {
                result.add(i);
                continue;
            }
            if (i[0] <= result.getLast()[1]) {
                result.getLast()[1] = Math.max(i[1], result.getLast()[1]);
            } else {
                result.add(i);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
