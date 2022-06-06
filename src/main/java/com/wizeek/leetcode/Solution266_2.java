package com.wizeek.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution266_2 {
    public boolean canPermutePalindrome(String s) {
        Set<Character> pairless = new HashSet<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (pairless.contains(c)) {
                pairless.remove(c);
            } else {
                pairless.add(c);
            }
        }
        return pairless.size() <= 1;
    }
}
