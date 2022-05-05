package com.wizeek.leetcode.p412;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String s = "";
            if (i % 3 == 0) {
                s += "Fizz";
            }
            if (i % 5 == 0) {
                s += "Buzz";
            }
            if ("".equals(s)) {
                s = String.valueOf(i);
            }
            result.add(s);
        }
        return result;
    }
}
