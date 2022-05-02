package com.wizeek.leetcode.p14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        if (strs[0].equals("")) {
            return "";
        }
        int longestIndex = 0;
        String firstString = strs[0];
        boolean mismatchFound = false;
        for (int i = 0; i < firstString.length(); i++) {
            if (mismatchFound) {
                break;
            }
            char c = firstString.charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == 0) {
                    return "";
                }
                if (i < strs[j].length()) {
                    if (strs[j].charAt(i) != c) {
                        mismatchFound = true;
                        break;
                    }
                } else {
                    mismatchFound = true;
                    break;
                }
            }
            if (!mismatchFound) {
                longestIndex++;
            }
        }
        return firstString.substring(0, longestIndex);
    }
}
