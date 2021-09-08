package com.wizeek.leetcode.p953;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<Character, Integer> charWeights = new HashMap<>();

    public boolean isAlienSorted(String[] words, String order) {
        fillCharWeights(order);
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!isCorrectOrder(words[i], words[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private void fillCharWeights(String order) {
        for (int i = 0; i < order.length(); i++) {
            charWeights.put(order.charAt(i), i);
        }
    }

    private boolean isCorrectOrder(String left, String right) { // aaa, az
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength; i++) {
            int leftWeight = charWeights.get(left.charAt(i));
            int rightWeight = charWeights.get(right.charAt(i));
            if (leftWeight > rightWeight) {
                return false;
            } else if (leftWeight < rightWeight) {
                return true;
            }
        }
        return left.length() > right.length() ? false : true;
    }
}
