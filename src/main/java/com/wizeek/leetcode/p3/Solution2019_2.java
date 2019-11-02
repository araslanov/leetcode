package com.wizeek.leetcode.p3;

import java.util.HashMap;
import java.util.Map;

public class Solution2019_2 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> indexMap = new HashMap<>();
        int startIndex = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer existingIndex = indexMap.get(c);
            if (existingIndex != null && existingIndex >= startIndex) {
                max = Math.max(max, i - startIndex);
                startIndex = existingIndex + 1;
            }
            indexMap.put(c, i);
        }
        max = Math.max(max, s.length() - startIndex);
        return max;
    }
}
