package com.wizeek.leetcode;

public class Solution859 {
    public boolean buddyStrings(String s, String goal) {
        int n = s.length();
        if (n != goal.length() || n < 2) {
            return false;
        }
        int difs = 0;
        int left = 0;
        int right = 0;
        int[] reps = new int[26];
        boolean dups = false;
        for (int i = 0; i < n; i++) {
            char c1 = s.charAt(i);
            char c2 = goal.charAt(i);
            if (c1 == c2) {
                if (++reps[c1 - 'a'] == 2) {
                    dups = true;
                }
            } else {
                difs++;
                if (difs > 2) {
                    return false;
                }
                if (difs == 1) {
                    left = i;
                } else {
                    right = i;
                }
            }
        }
        if (difs == 1) {
            return false;
        }
        if (difs == 2) {
            return s.charAt(left) == goal.charAt(right) && s.charAt(right) == goal.charAt(left);
        }
        return dups;
    }
}
