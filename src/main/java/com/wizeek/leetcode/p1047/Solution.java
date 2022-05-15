package com.wizeek.leetcode.p1047;

public class Solution {
    public String removeDuplicates(String s) {
        if (s.length() < 2) {
            return s;
        }
        StringBuilder string = new StringBuilder(s);
        int i = 0;
        while (i < string.length() - 1) {
            char left = string.charAt(i);
            char right = string.charAt(i + 1);
            if (left == right) {
                string.deleteCharAt(i + 1);
                string.deleteCharAt(i);
                i = Math.max(0, i - 1);
            } else {
                i++;
            }
        }
        return string.toString();
    }
}
