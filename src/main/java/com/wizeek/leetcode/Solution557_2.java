package com.wizeek.leetcode;

public class Solution557_2 {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        for (String word : words) {
            int n = word.length();
            for (int i = n - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }
            sb.append(' ');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
