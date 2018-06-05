package com.wizeek.leetcode.p3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Artur on 6/2/2018.
 */
public class Solution4 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> currentSubstring = new HashMap<>(1000);
        TreeMap<Integer, Character> reverseMap = new TreeMap<>();
        char currentChar;
        int max = 0;
        int length;
        Integer existingIndex;
        for (int i = 0; i < chars.length; i++) {
            currentChar = chars[i];
            existingIndex = currentSubstring.put(currentChar, i);
            reverseMap.put(i, currentChar);
            if (!(existingIndex == null)) {
                length = currentSubstring.keySet().size();
                if (max < length) {
                    max = length;
                }
                Map.Entry<Integer, Character> entry;
                do {
                    entry = reverseMap.pollFirstEntry();
                    currentSubstring.remove(entry.getValue());
                } while (entry.getKey() < existingIndex);
                currentSubstring.put(currentChar, i);
            }
        }
        length = currentSubstring.keySet().size();
        if (max < length) {
            max = length;
        }
        return max;
    }
}
