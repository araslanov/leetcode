package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            Character replace = map.get(sc);
            if (replace == null) {
                if (used.contains(tc)) {
                    return false;
                }
                map.put(sc, tc);
                used.add(tc);
            } else {
                if (replace != tc) {
                    return false;
                }
            }
        }
        return true;
    }
}
