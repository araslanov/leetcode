package com.wizeek.leetcode;

import java.util.LinkedList;

public class Solution28 {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        if (n > h) {
            return -1;
        }
        int s = h - n + 1;
        LinkedList<Character>[] subs = new LinkedList[s];
        for (int i = 0; i < h; i++) {
            for (int j = i; j >= 0 && j > i - n; j--) {
                if (j >= s) {
                    continue;
                }
                if (subs[j] == null) {
                    subs[j] = new LinkedList<>();
                }
                subs[j].addLast(haystack.charAt(i));
            }
        }
        for (int j = 0; j < s; j++) {
            boolean mismatch = false;
            for (int i = 0; i < n; i++) {
                if (needle.charAt(i) != subs[j].pollFirst()) {
                    mismatch = true;
                    break;
                }
            }
            if (!mismatch) {
                return j;
            }
        }
        return -1;
    }
}
