package com.wizeek.leetcode.p171;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static final Map<Character, Integer> MAP = new HashMap<>(26);

    static {
        for (char c = 'A'; c <= 'Z'; c++) {
            MAP.put(c, c - 'A' + 1);
        }
    }

    public int titleToNumber(String columnTitle) {
        int size = columnTitle.length();
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += Math.pow(26, i) * (columnTitle.charAt(size - i - 1) - 'A' + 1);
        }
        return result;
    }
}
