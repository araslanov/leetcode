package com.wizeek.leetcode.p3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> currentSubstring = new HashMap<>();
        char currentChar;
        int max = 0;
        int length;
        Integer existingIndex;
        for (int i = 0; i < chars.length; i++) {
            currentChar = chars[i];
            if (!currentSubstring.containsKey(currentChar)) {
                currentSubstring.put(currentChar, i);
            } else {
                existingIndex = currentSubstring.get(currentChar);
                length = currentSubstring.keySet().size();
                if (max < length) {
                    max = length;
                }
                currentSubstring.clear();
                for (int j = existingIndex + 1; j <= i; j++) {
                    currentSubstring.put(chars[j], j);
                }
            }
        }
        length = currentSubstring.keySet().size();
        if (max < length) {
            max = length;
        }
        return max;
    }
}
