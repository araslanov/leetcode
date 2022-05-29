package com.wizeek.leetcode;

public class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int[] charCount = new int[26];
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        int result = 0;
        for (String s : words) {
            int[] copy = new int[26];
            System.arraycopy(charCount, 0, copy, 0, 26);
            int i = 0;
            int n = s.length();
            for (; i < n; i++) {
                if (--copy[s.charAt(i) - 'a'] < 0) {
                    break;
                }
            }
            if (i == n) {
                result += n;
            }
        }
        return result;
    }
}
