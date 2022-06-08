package com.wizeek.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution339_2 {
    public int depthSum(List<NestedInteger> nestedList) {
        int result = 0;
        Queue<NestedIntegerWrapper> queue = new LinkedList<>();
        for (NestedInteger i : nestedList) {
            queue.add(new NestedIntegerWrapper(i, 1));
        }
        while (!queue.isEmpty()) {
            NestedIntegerWrapper i = queue.poll();
            if (i.nestedInteger.isInteger()) {
                result += i.nestedInteger.getInteger() * i.depth;
            } else {
                for (NestedInteger i1 : i.nestedInteger.getList()) {
                    queue.add(new NestedIntegerWrapper(i1, i.depth + 1));
                }
            }
        }
        return result;
    }

    private static class NestedIntegerWrapper {
        private NestedInteger nestedInteger;
        private int depth;

        private NestedIntegerWrapper(NestedInteger nestedInteger, int depth) {
            this.nestedInteger = nestedInteger;
            this.depth = depth;
        }
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
