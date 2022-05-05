package com.wizeek.leetcode.p412;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>(n);
        int i = 3;
        while (i <= n) {
            result.add(String.valueOf(i - 2));
            result.add(String.valueOf(i - 1));
            result.add("Fizz");
            i += 3;
        }
        for (int j = 1; j <= n % 3; j++) {
            result.add(String.valueOf(i - 3 + j));
        }
        i = 5;
        while (i <= n) {
            if (i % 15 == 0) {
                result.set(i - 1, "FizzBuzz");
            } else {
                result.set(i - 1, "Buzz");
            }
            i += 5;
        }
        return result;
    }
}
