package com.wizeek.leetcode;

public class Solution383_2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        if (n > m) {
            return false;
        }
        int[] chars = new int[26];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int c = chars[ransomNote.charAt(i) - 'a']++;
            if (c == 0) {
                count++;
            }
        }
        for (int i = 0; i < m; i++) {
            int remaining = --chars[magazine.charAt(i) - 'a'];
            if (remaining == 0) {
                count--;
                if (count == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
