package com.wizeek.leetcode.p697;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> firstOccurrenceMap = new HashMap<>();
        Map<Integer, Integer> repetitionsMap = new HashMap<>();
        int[] minLengthByDegree = new int[50000];
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (!firstOccurrenceMap.containsKey(n)) {
                firstOccurrenceMap.put(n, i);
            }
            int currentLength = repetitionsMap.getOrDefault(n, 0) + 1;
            repetitionsMap.put(n, currentLength);
            if (degree <= currentLength) {
                degree = currentLength;
                int newLength = i - firstOccurrenceMap.get(n) + 1;
                if (minLengthByDegree[degree - 1] == 0 || minLengthByDegree[degree - 1] > newLength) {
                    minLengthByDegree[degree - 1] = newLength;
                }
            }
        }
        return minLengthByDegree[degree - 1];
    }
}
