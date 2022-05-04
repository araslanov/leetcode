package com.wizeek.leetcode.p1207;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> valueRepetitions = new HashMap<>();
        int[] repetitionsRepetitions = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            Integer newRepetitions = valueRepetitions.merge(value, 1, Integer::sum);
            repetitionsRepetitions[newRepetitions - 1] = repetitionsRepetitions[newRepetitions - 1] + 1;
            if (newRepetitions > 1) {
                repetitionsRepetitions[newRepetitions - 2] = repetitionsRepetitions[newRepetitions - 2] - 1;
            }
        }
        for (int i = 0; i < 1000; i++) {
            if (repetitionsRepetitions[i] > 1) {
                return false;
            }
        }
        return true;
    }
}
