package com.wizeek.leetcode.p6;

public class Solution_2 {
    public String convert(String s, int numRows) {
        int n = s.length();
        if (n < 2 || numRows == 1) {
            return s;
        }
        StringBuilder builder = new StringBuilder(n);
        int fullStep = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < n; j += fullStep) {
                builder.append(s.charAt(j));
                if (i > 0 && i < numRows - 1 && j + fullStep - 2 * i < n) {
                    builder.append(s.charAt(j + fullStep - 2 * i));
                }
            }
        }
        return builder.toString();
    }
}
