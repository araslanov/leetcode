package com.wizeek.leetcode.p8;

public class Solution {
    public int myAtoi(String str) {
        int result = 0;
        boolean digitExpected = false;
        int extraForNegative = 0;

        int size = str.length();
        for (int i = 0; i < size; i++) {
            char currentChar = str.charAt(i);
            if (currentChar == ' ') {
                if (digitExpected) {
                    break;
                }
                continue;
            }
            if (currentChar == '-') {
                if (digitExpected) {
                    break;
                }
                digitExpected = true;
                extraForNegative = 1;
                continue;
            }
            if (currentChar == '+') {
                if (digitExpected) {
                    break;
                }
                digitExpected = true;
                continue;
            }
            if (currentChar == '0' && result == 0) {
                digitExpected = true;
                continue;
            }
            if (currentChar == '0') {
                if (result > Integer.MAX_VALUE / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10;
                continue;
            }
            if (currentChar == '1') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 1) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 1;
                continue;
            }
            if (currentChar == '2') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 2) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 2;
                continue;
            }
            if (currentChar == '3') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 3) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 3;
                continue;
            }
            if (currentChar == '4') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 4) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 4;
                continue;
            }
            if (currentChar == '5') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 5) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 5;
                continue;
            }
            if (currentChar == '6') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 6) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 6;
                continue;
            }
            if (currentChar == '7') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 7) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 7;
                continue;
            }
            if (currentChar == '8') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 8) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 8;
                continue;
            }
            if (currentChar == '9') {
                if (result > (Integer.MAX_VALUE + extraForNegative - 9) / 10) {
                    return extraForNegative > 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10 + 9;
                continue;
            }
            break;
        }

        return extraForNegative > 0 ? 0 - result : result;
    }
}
