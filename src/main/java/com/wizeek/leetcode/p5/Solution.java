package com.wizeek.leetcode.p5;

public class Solution {
    public String longestPalindrome(String s) {
        int[] maxBounds = new int[]{0, 0};
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < i + 2; j++) {
                int[] bounds = findLongestPalindromeInSurroundings(s, i, j);
                if (bounds[1] - bounds[0] > maxBounds[1] - maxBounds[0]) {
                    maxBounds = bounds;
                }
            }
        }
        return s.substring(maxBounds[0], maxBounds[1]);
    }

    private int[] findLongestPalindromeInSurroundings(String s, int i, int j) {
        boolean needCompensation = false;
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            needCompensation = true;
        }
        if (i < 0 || j >= s.length() || needCompensation) {
            return new int[]{i + 1, j};
        } else {
            return new int[]{i, j};
        }
    }
}
