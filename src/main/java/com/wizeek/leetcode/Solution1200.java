package com.wizeek.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int num : arr) {
            minValue = Math.min(minValue, num);
            maxValue = Math.max(maxValue, num);
        }
        int[] values = new int[maxValue - minValue + 1];
        for (int num : arr) {
            values[num - minValue]++;
        }
        Integer previous = null;
        Integer current = null;
        int minDiff = Integer.MAX_VALUE;
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 0) {
                continue;
            }
            if (current == null) {
                current = i;
                continue;
            }
            previous = current;
            current = i;
            int diff = current - previous;
            if (diff < minDiff) {
                minDiff = diff;
                result.clear();
                result.add(Arrays.asList(previous + minValue, current + minValue));
            } else if (diff == minDiff) {
                result.add(Arrays.asList(previous + minValue, current + minValue));
            }
        }
        return result;
    }
}
