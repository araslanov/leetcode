package com.wizeek.leetcode;

public class Solution844 {
    public boolean backspaceCompare(String s, String t) {
        String s1 = parse(s);
        String t1 = parse(t);
        return s1.equals(t1);
    }

    private String parse(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') {
                int n = sb.length();
                if (n > 0) {
                    sb.deleteCharAt(n - 1);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
