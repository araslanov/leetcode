package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution17_2 {
    private static final String[] mapping = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        List<String> result = new LinkedList<>();
        if (digits.length() == 0) {
            return result;
        }
        int n = digits.length();
        Queue<StringBuilder> queue = new LinkedList<>();
        queue.offer(new StringBuilder());
        int i = 0;
        while (i < n) {
            Integer digit = Integer.parseInt("" + digits.charAt(i));
            String letters = mapping[digit];
            int q = queue.size();
            while (q > 0) {
                StringBuilder sb = queue.poll();
                for (int j = 0; j < letters.length(); j++) {
                    StringBuilder sbNew = new StringBuilder(sb);
                    sbNew.append(letters.charAt(j));
                    queue.offer(sbNew);
                }
                q--;
            }
            i++;
        }
        for (StringBuilder sb : queue) {
            result.add(sb.toString());
        }
        return result;
    }
}
