package com.wizeek.leetcode;

import java.util.Arrays;

public class Solution205 {
    public boolean isIsomorphic(String s, String t) {
        int[] there = new int[256];
        Arrays.fill(there, -1);
        int[] back = new int[256];
        Arrays.fill(back, -1);
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            int replace = there[sc];
            if (replace < 0) {
                if (back[tc] > 0) {
                    return false;
                }
                there[sc] = tc;
                back[tc] = sc;
            } else {
                if (replace != tc) {
                    return false;
                }
            }
        }
        return true;
    }
}
