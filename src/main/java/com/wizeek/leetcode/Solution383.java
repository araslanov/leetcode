package com.wizeek.leetcode;

public class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        if (n > m) {
            return false;
        }
        int[] chars = new int[26];
        for (int i = 0; i < m; i++) {
            chars[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            int remaining = --chars[ransomNote.charAt(i) - 'a'];
            if (remaining < 0) {
                return false;
            }
        }
        return true;
    }
}
