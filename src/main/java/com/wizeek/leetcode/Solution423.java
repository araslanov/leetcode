package com.wizeek.leetcode;

public class Solution423 {
    public String originalDigits(String s) {
        int[] charCount = new int[26];
        int[] digitCount = new int[10];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        digitCount[0] = remove0(charCount);
        digitCount[2] = remove2(charCount);
        digitCount[6] = remove6(charCount);
        digitCount[8] = remove8(charCount);
        digitCount[7] = remove7(charCount);
        digitCount[5] = remove5(charCount);
        digitCount[4] = remove4(charCount);
        digitCount[1] = remove1(charCount);
        digitCount[3] = remove3(charCount);
        digitCount[9] = remove9(charCount);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < digitCount[i]; j++) {
                result.append(i);
            }
        }
        return result.toString();
    }

    private int remove0(int[] charCount) {
        int count = charCount['z' - 'a'];
        removeChars(charCount, 'z', count);
        removeChars(charCount, 'e', count);
        removeChars(charCount, 'r', count);
        removeChars(charCount, 'o', count);
        return count;
    }

    private int remove2(int[] charCount) {
        int count = charCount['w' - 'a'];
        removeChars(charCount, 't', count);
        removeChars(charCount, 'w', count);
        removeChars(charCount, 'o', count);
        return count;
    }

    private int remove6(int[] charCount) {
        int count = charCount['x' - 'a'];
        removeChars(charCount, 's', count);
        removeChars(charCount, 'i', count);
        removeChars(charCount, 'x', count);
        return count;
    }

    private int remove8(int[] charCount) {
        int count = charCount['g' - 'a'];
        removeChars(charCount, 'e', count);
        removeChars(charCount, 'i', count);
        removeChars(charCount, 'g', count);
        removeChars(charCount, 'h', count);
        removeChars(charCount, 't', count);
        return count;
    }

    private int remove7(int[] charCount) {
        int count = charCount['s' - 'a'];
        removeChars(charCount, 's', count);
        removeChars(charCount, 'e', count);
        removeChars(charCount, 'v', count);
        removeChars(charCount, 'e', count);
        removeChars(charCount, 'n', count);
        return count;
    }

    private int remove5(int[] charCount) {
        int count = charCount['v' - 'a'];
        removeChars(charCount, 'f', count);
        removeChars(charCount, 'i', count);
        removeChars(charCount, 'v', count);
        removeChars(charCount, 'e', count);
        return count;
    }

    private int remove4(int[] charCount) {
        int count = charCount['f' - 'a'];
        removeChars(charCount, 'f', count);
        removeChars(charCount, 'o', count);
        removeChars(charCount, 'u', count);
        removeChars(charCount, 'r', count);
        return count;
    }

    private int remove1(int[] charCount) {
        int count = charCount['o' - 'a'];
        removeChars(charCount, 'o', count);
        removeChars(charCount, 'n', count);
        removeChars(charCount, 'e', count);
        return count;
    }

    private int remove3(int[] charCount) {
        int count = charCount['t' - 'a'];
        removeChars(charCount, 't', count);
        removeChars(charCount, 'h', count);
        removeChars(charCount, 'r', count);
        removeChars(charCount, 'e', count);
        removeChars(charCount, 'e', count);
        return count;
    }

    private int remove9(int[] charCount) {
        int count = charCount['i' - 'a'];
        removeChars(charCount, 'n', count);
        removeChars(charCount, 'i', count);
        removeChars(charCount, 'n', count);
        removeChars(charCount, 'e', count);
        return count;
    }

    private void removeChars(int[] charCount, char c, int count) {
        charCount[c - 'a'] -= count;
    }
}
