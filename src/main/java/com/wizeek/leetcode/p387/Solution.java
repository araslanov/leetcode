package com.wizeek.leetcode.p387;

public class Solution {
    public int firstUniqChar(String s) {
        int[] frequency = new int[26];
        for (char c : s.toCharArray()) {
            int i = c - 'a';
            frequency[i]++;
        }
        for (int i = 0; i < s.length(); i++) {
            int j = s.charAt(i) - 'a';
            if (frequency[j] == 1) {
                return i;
            }
        }
        return -1;
    }
}
