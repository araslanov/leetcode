package com.wizeek.leetcode.p13;

import java.util.Map;

public class Solution {
    private static final Map<Character, Integer> ROMAN_TO_ARABIC = Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100,
            'D', 500, 'M', 1000);

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = ROMAN_TO_ARABIC.get(s.charAt(i));
            if (current == 1) {
                if (i + 1 < s.length()) {
                    int next = ROMAN_TO_ARABIC.get(s.charAt(i + 1));
                    if (next == 5 || next == 10) {
                        result = result - current;
                    } else {
                        result = result + current;
                    }
                } else {
                    result += current;
                }
            } else if (current == 10) {
                if (i + 1 < s.length()) {
                    int next = ROMAN_TO_ARABIC.get(s.charAt(i + 1));
                    if (next == 50 || next == 100) {
                        result = result - current;
                    } else {
                        result = result + current;
                    }
                } else {
                    result += current;
                }
            } else if (current == 100) {
                if (i + 1 < s.length()) {
                    int next = ROMAN_TO_ARABIC.get(s.charAt(i + 1));
                    if (next == 500 || next == 1000) {
                        result = result - current;
                    } else {
                        result = result + current;
                    }
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        return result;
    }
}
