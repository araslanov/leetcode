package com.wizeek.leetcode.p3;

import java.util.HashMap;
import java.util.Map;

public class Solution2019 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        Map<Character, Integer> currentCharMap = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            Integer existingIndex = currentCharMap.get(c);
            if (existingIndex != null) {
                int currentLength = currentCharMap.size();
                if (currentLength > max) {
                    max = currentLength;
                }
            }
            currentCharMap.put(c, i);
        }
        int currentLength = currentCharMap.size();
        if (currentLength > max) {
            max = currentLength;
        }
        return max;
    }
}
