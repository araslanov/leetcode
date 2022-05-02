package com.wizeek.leetcode.p408;

public class Solution {
    private static final String DIGITS = "0123456789";

    public boolean validWordAbbreviation(String word, String abbr) {
        int wordIndex = 0;
        int abbrIndex = 0;
        while (abbrIndex < abbr.length()) {
            char c = abbr.charAt(abbrIndex);
            if (isDigit(c)) {
                int currentLength = Integer.parseInt(String.valueOf(c));
                if (currentLength == 0) {
                    return false;
                }
                abbrIndex++;
                while (abbrIndex < abbr.length() && isDigit(abbr.charAt(abbrIndex))) {
                    currentLength = currentLength * 10 + Integer.parseInt(String.valueOf(abbr.charAt(abbrIndex)));
                    abbrIndex++;
                }
                if (wordIndex + currentLength <= word.length()) {
                    wordIndex += currentLength;
                } else {
                    return false;
                }
            } else {
                if (wordIndex < word.length() && word.charAt(wordIndex) == c) {
                    abbrIndex++;
                    wordIndex++;
                } else {
                    return false;
                }
            }
        }
        if (wordIndex < word.length()) {
            return false;
        }
        return true;
    }

    private boolean isDigit(char c) {
        return DIGITS.indexOf(c) > -1;
    }
}
