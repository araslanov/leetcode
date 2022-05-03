package com.wizeek.leetcode.p696;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public int countBinarySubstrings(String s) {
        if (s.length() == 1) {
            return 0;
        }
        boolean isPreviousZero = s.charAt(0) == '0';
        int consecutiveDigits = 1;
        List<Integer> consecutiveDigitList = new ArrayList<>(s.length());
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                if (isPreviousZero) {
                    consecutiveDigits++;
                } else {
                    consecutiveDigitList.add(consecutiveDigits);
                    consecutiveDigits = 1;
                }
                isPreviousZero = true;
            } else if (s.charAt(i) == '1') {
                if (!isPreviousZero) {
                    consecutiveDigits++;
                } else {
                    consecutiveDigitList.add(consecutiveDigits);
                    consecutiveDigits = 1;
                }
                isPreviousZero = false;
            }
        }
        consecutiveDigitList.add(consecutiveDigits);
        int result = 0;
        for (int i = 0; i < consecutiveDigitList.size() - 1; i++) {
            int left = consecutiveDigitList.get(i);
            int right = consecutiveDigitList.get(i + 1);
            result += Math.min(left, right);
        }
        return result;
    }
}
