package com.wizeek.leetcode;

public class Solution242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            int i = --count[c - 'a'];
            if (i < 0) {
                return false;
            }
        }
        for (int i : count) {
            if (i > 0) {
                return false;
            }
        }
        return true;
    }
}
