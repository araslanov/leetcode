package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        recurse(result, new StringBuilder(), n, n);
        return result;
    }

    private void recurse(List<String> result, StringBuilder sb, int openingLeft, int closingLeft) {
        if (closingLeft == 0) {
            result.add(sb.toString());
            return;
        }
        if (openingLeft > 0) {
            sb.append("(");
            recurse(result, sb, openingLeft - 1, closingLeft);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (closingLeft > openingLeft) {
            sb.append(")");
            recurse(result, sb, openingLeft, closingLeft - 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
