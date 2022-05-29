package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution1002 {
    public List<String> commonChars(String[] words) {
        int[] common = getCharCount(words[0]);
        int n = words.length;
        for (int i = 1; i < n; i++) {
            int[] count = getCharCount(words[i]);
            reduce(common, count);
        }
        List<String> result = new LinkedList<>();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < common[i]; j++) {
                result.add(String.valueOf((char) (i + 'a')));
            }
        }
        return result;
    }

    private int[] getCharCount(String word) {
        int[] charCount = new int[26];
        for (char c : word.toCharArray()) {
            charCount[c - 'a']++;
        }
        return charCount;
    }

    private void reduce(int[] common, int[] count) {
        for (int i = 0; i < 26; i++) {
            common[i] = Math.min(common[i], count[i]);
        }
    }
}
