package com.wizeek.leetcode.p696;

public class Solution2 {
    public int countBinarySubstrings(String s) {
        if (s.length() == 1) {
            return 0;
        }
        boolean isPreviousZero = s.charAt(0) == '0';
        int consecutiveDigits = 1;
        int previousConsecutiveDigits = 0;
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (isPreviousZero) {
                    consecutiveDigits++;
                } else {
                    if (previousConsecutiveDigits > 0) {
                        result += Math.min(previousConsecutiveDigits, consecutiveDigits);
                    }
                    previousConsecutiveDigits = consecutiveDigits;
                    consecutiveDigits = 1;
                }
                isPreviousZero = true;
            } else if (s.charAt(i) == '1') {
                if (!isPreviousZero) {
                    consecutiveDigits++;
                } else {
                    if (previousConsecutiveDigits > 0) {
                        result += Math.min(previousConsecutiveDigits, consecutiveDigits);
                    }
                    previousConsecutiveDigits = consecutiveDigits;
                    consecutiveDigits = 1;
                }
                isPreviousZero = false;
            }
        }
        result += Math.min(previousConsecutiveDigits, consecutiveDigits);
        return result;
    }
}
