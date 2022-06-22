package com.wizeek.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution17 {
    private static final Map<Integer, String> map;

    static {
        map = new HashMap<>();
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

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
        String chars = map.get(digit);
        int l = chars.length();
        for (int j = 0; j < l; j++) {
            char c = chars.charAt(j);
            sb.append(c);
            recurse(result, sb, digits, i + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
