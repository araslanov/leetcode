package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution339 {
    public int depthSum(List<NestedInteger> nestedList) {
        int result = 0;
        for (NestedInteger i : nestedList) {
            result += getSum(i, 1);
        }
        return result;
    }

    private int getSum(NestedInteger i, int depth) {
        if (i.isInteger()) {
            return i.getInteger() * depth;
        }
        int sum = 0;
        for (NestedInteger nested : i.getList()) {
            sum += getSum(nested, depth + 1);
        }
        return sum;
    }

    public static class NestedInteger {
        private int value;
        private final List<NestedInteger> list = new LinkedList<>();

        // Constructor initializes an empty nested list.
        public NestedInteger() {
        }

        // Constructor initializes a single integer.
        public NestedInteger(int value) {
            this.value = value;
        }

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger() {
            return list.isEmpty();
        }

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger() {
            return value;
        }

        // Set this NestedInteger to hold a single integer.
        public void setInteger(int value) {
            this.value = value;
        }

        // Set this NestedInteger to hold a nested list and adds a nested integer to it.
        public void add(NestedInteger ni) {
            list.add(ni);
        }

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList() {
            return list;
        }
    }
}
