package com.wizeek.leetcode;

public class Solution394 {
    public String decodeString(String s) {
        int n = s.length();
        int number = 0;
        int i = 0;
        StringBuilder result = new StringBuilder();
        while (i < n) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                number = 10 * number + c - '0';
            } else if (c == '[') {
                int score = 1;
                StringBuilder current = new StringBuilder();
                boolean nested = false;
                while (score > 0) {
                    i++;
                    char b = s.charAt(i);
                    if (b == '[') {
                        nested = true;
                        score++;
                    } else if (b == ']') {
                        score--;
                    }
                    if (score > 0) {
                        current.append(b);
                    }
                }
                String sub = nested ? decodeString(current.toString()) : current.toString();
                for (int j = 0; j < number; j++) {
                    result.append(sub);
                }
                number = 0;
            } else {
                result.append(c);
            }
            i++;
        }
        return result.toString();
    }
}
