package com.wizeek.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution244 {
    private final Map<String, List<Integer>> map = new HashMap<>();

    public Solution244(String[] wordsDict) {
        int n = wordsDict.length;
        for (int i = 0; i < n; i++) {
            String word = wordsDict[i];
            map.computeIfAbsent(word, k -> new ArrayList<>()).add(i);
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> leftIndexes = map.get(word1);
        List<Integer> rightIndexes = map.get(word2);
        int i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        while (i < leftIndexes.size() && j < rightIndexes.size()) {
            int left = leftIndexes.get(i);
            int right = rightIndexes.get(j);
            min = Math.min(min, Math.abs(left - right));
            if (left < right) {
                i++;
            } else {
                j++;
            }
        }
        return min;
    }
}
