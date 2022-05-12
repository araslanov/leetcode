package com.wizeek.leetcode.p125;

public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char left = s.charAt(start);
            if (!isAlphanumeric(left)) {
                start++;
                continue;
            }
            char right = s.charAt(end);
            if (!isAlphanumeric(right)) {
                end--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private static boolean isAlphanumeric(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
