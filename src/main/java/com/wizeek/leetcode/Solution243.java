package com.wizeek.leetcode;

public class Solution243 {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int n = wordsDict.length;
        int pos1 = -1;
        int pos2 = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (wordsDict[i].equals(word1)) {
                pos1 = i;
                if (pos2 >= 0) {
                    min = Math.min(min, Math.abs(pos1 - pos2));
                }
            } else if (wordsDict[i].equals(word2)) {
                pos2 = i;
                if (pos1 >= 0) {
                    min = Math.min(min, Math.abs(pos1 - pos2));
                }
            }
        }
        return min;
    }
}
