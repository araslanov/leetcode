package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution791 {
    public String customSortString(String order, String s) {
        int[] chars = new int[26];
        for (int i = 0; i < order.length(); i++) {
            chars[order.charAt(i) - 'a'] = i;
        }
        Character[] sChars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            sChars[i] = s.charAt(i);
        }
        Arrays.sort(sChars, (a, b) -> chars[a - 'a'] - chars[b - 'a']);
        char[] charz = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charz[i] = sChars[i];
        }
        return new String(charz);
    }
}
