package com.wizeek.leetcode;

public class Solution227 {
    public int calculate(String s) {
        String[] terms = s.split("\\+");
        int result = 0;
        for (String add : terms) {
            result += calculate1(add);
        }
        return result;
    }

    private int calculate1(String s) {
        String[] terms = s.split("\\-");
        int result = calculate2(terms[0]);
        for (int i = 1; i < terms.length; i++) {
            result -= calculate2(terms[i]);
        }
        return result;
    }

    private int calculate2(String s) {
        int n = s.length();
        Integer previous = null;
        int current = 0;
        boolean multiply = true;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }
            if (c == '*') {
                if (previous == null) {
                    previous = current;
                } else {
                    previous = multiply ? previous * current : previous / current;
                }
                multiply = true;
                current = 0;
            } else if (c == '/') {
                if (previous == null) {
                    previous = current;
                } else {
                    previous = multiply ? previous * current : previous / current;
                }
                multiply = false;
                current = 0;
            } else {
                current = 10 * current + c - '0';
            }
        }
        if (previous == null) {
            return current;
        }
        return multiply ? previous * current : previous / current;
    }
}
