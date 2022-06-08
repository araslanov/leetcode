package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        recurse(result, "(", n - 1, n);
        return result;
    }

    private void recurse(List<String> result, String base, int openingLeft, int closingLeft) {
        if (closingLeft == 0) {
            result.add(base);
            return;
        }
        if (openingLeft > 0) {
            recurse(result, base + "(", openingLeft - 1, closingLeft);
        }
        if (closingLeft > openingLeft) {
            recurse(result, base + ")", openingLeft, closingLeft - 1);
        }
    }
}
