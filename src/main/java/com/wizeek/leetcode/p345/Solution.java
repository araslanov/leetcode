package com.wizeek.leetcode.p345;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private static final Set<Character> VOWELS = new HashSet<>(10);

    static {
        VOWELS.add('a');
        VOWELS.add('A');
        VOWELS.add('e');
        VOWELS.add('E');
        VOWELS.add('i');
        VOWELS.add('I');
        VOWELS.add('o');
        VOWELS.add('O');
        VOWELS.add('u');
        VOWELS.add('U');
    }

    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length - 1;
        while (left < right) {
            boolean isLeftVowel = isVowel(a[left]);
            boolean isRightVowel = isVowel(a[right]);
            if (isLeftVowel && isRightVowel) {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            } else if (!isLeftVowel && !isRightVowel) {
                left++;
                right--;
            } else if (!isLeftVowel) {
                left++;
            } else {
                right--;
            }
        }
        return new String(a);
    }

    private static boolean isVowel(char c) {
        return VOWELS.contains(c);
    }
}
