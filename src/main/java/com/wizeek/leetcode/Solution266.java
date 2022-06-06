package com.wizeek.leetcode;

public class Solution266 {
    public boolean canPermutePalindrome(String s) {
        int[] count = new int[26];
        int n = s.length();
        int odd = 0;
        for (int i = 0; i < n; i++) {
            int newCount = ++count[s.charAt(i) - 'a'];
            if (newCount % 2 > 0) {
                odd++;
            } else {
                odd--;
            }
        }
        return odd <= 1;
    }
}
