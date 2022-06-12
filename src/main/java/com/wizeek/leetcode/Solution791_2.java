package com.wizeek.leetcode;

public class Solution791_2 {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        int m = order.length();
        for (int i = 0; i < m; i++) {
            char c = order.charAt(i);
            int cn = count[c - 'a'];
            for (int j = 0; j < cn; j++) {
                result.append(c);
            }
            count[c - 'a'] = 0;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                for (int j = 0; j < count[i]; j++) {
                    result.append((char) ('a' + i));
                }
            }
        }
        return result.toString();
    }
}
