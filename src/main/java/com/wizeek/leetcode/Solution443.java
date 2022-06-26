package com.wizeek.leetcode;

public class Solution443 {
    public int compress(char[] chars) {
        char current = chars[0];
        int count = 1;
        int j = 0;
        int n = chars.length;
        for (int i = 1; i <= n; i++) {
            if (i == n || chars[i] != current) {
                chars[j++] = current;
                if (count > 1) {
                    String s = String.valueOf(count);
                    for (int k = 0; k < s.length(); k++) {
                        chars[j++] = s.charAt(k);
                    }
                }
                if (i < n) {
                    current = chars[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }
        return j;
    }
}
