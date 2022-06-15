package com.wizeek.leetcode;

public class Solution1332 {
    public int removePalindromeSub(String s) {
        int left = 0;
        int right = s.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        return isPalindrome ? 1 : 2;
    }
}
