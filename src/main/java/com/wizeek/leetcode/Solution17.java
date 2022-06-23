package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution17 {
    private static final String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        if (digits.length() == 0) {
            return result;
        }
        recurse(result, new StringBuilder(), digits, 0);
        return result;
    }

    private void recurse(List<String> result, StringBuilder sb, String digits, int i) {
        int n = digits.length();
        if (i == n) {
            result.add(sb.toString());
            return;
        }
        Integer digit = Integer.parseInt("" + digits.charAt(i));
        String chars = mapping[digit];
        int l = chars.length();
        for (int j = 0; j < l; j++) {
            char c = chars.charAt(j);
            sb.append(c);
            recurse(result, sb, digits, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
