package com.wizeek.leetcode.p696;

public class Solution {
    public int countBinarySubstrings(String s) {
        int result = 0;
        int consecutiveZeroCount = 0;
        int consecutiveOneCount = 0;
        Boolean isPreviousZero = null;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (isPreviousZero != null && !isPreviousZero) {
                    consecutiveZeroCount = 0;
                }
                consecutiveZeroCount++;
                if (consecutiveOneCount > 0) {
                    consecutiveOneCount--;
                    result++;
                }
                isPreviousZero = true;
            } else if (s.charAt(i) == '1') {
                if (isPreviousZero != null && isPreviousZero) {
                    consecutiveOneCount = 0;
                }
                consecutiveOneCount++;
                if (consecutiveZeroCount > 0) {
                    consecutiveZeroCount--;
                    result++;
                }
                isPreviousZero = false;
            }
        }
        return result;
    }
}
