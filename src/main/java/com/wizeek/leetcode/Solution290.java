package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String[] split = s.split(" ");
        if (split.length != n) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String word = map.get(pattern.charAt(i));
            if (word == null) {
                word = split[i];
                map.put(pattern.charAt(i), word);
            }
            if (!word.equals(split[i])) {
                return false;
            }
        }
        return true;
    }
}
