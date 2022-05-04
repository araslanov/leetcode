package com.wizeek.leetcode.p415;

public class Solution {
    public String addStrings(String num1, String num2) {
        int i1 = num1.length() - 1;
        int i2 = num2.length() - 1;
        int resultLength = Math.max(num1.length(), num2.length()) + 1;
        StringBuilder result = new StringBuilder(resultLength);
        int carry = 0;
        while (i1 >= 0 || i2 >= 0) {
            char digit1 = i1 >= 0 ? num1.charAt(i1) : '0';
            char digit2 = i2 >= 0 ? num2.charAt(i2) : '0';
            char sum = (char) (digit1 + digit2 + carry - '0');
            if (sum % '0' > 9) {
                carry = 1;
                result.append((char) (sum - 10));
            } else {
                carry = 0;
                result.append(sum);
            }
            i1--;
            i2--;
        }
        if (carry > 0) {
            result.append("1");
        }
        return result.reverse().toString();
    }
}
