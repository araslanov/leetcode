package com.wizeek.leetcode.p387;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int firstUniqChar(String s) {
        Set<Character> repeatedChars = new HashSet<>();
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (repeatedChars.contains(c)) {
                continue;
            }
            int newReps = frequencyMap.getOrDefault(c, 0) + 1;
            frequencyMap.put(c, newReps);
            if (newReps == 2) {
                repeatedChars.add(c);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
