package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Solution339Test {

    private Solution339 solution;

    @Before
    public void setUp() {
        solution = new Solution339();
    }

    @Test
    public void test1() {
        List<Solution339.NestedInteger> list = new LinkedList<>();
        Solution339.NestedInteger nested1 = new Solution339.NestedInteger();
        nested1.add(new Solution339.NestedInteger(1));
        nested1.add(new Solution339.NestedInteger(1));
        list.add(nested1);
        list.add(new Solution339.NestedInteger(2));
        Solution339.NestedInteger nested2 = new Solution339.NestedInteger();
        nested1.add(new Solution339.NestedInteger(1));
        nested1.add(new Solution339.NestedInteger(1));
        list.add(nested2);

        assertEquals(10, solution.depthSum(list));
    }

    @Test
    public void test2() {
        List<Solution339.NestedInteger> list = new LinkedList<>();
        list.add(new Solution339.NestedInteger(1));
        Solution339.NestedInteger nested1 = new Solution339.NestedInteger();
        nested1.add(new Solution339.NestedInteger(4));
        Solution339.NestedInteger nested2 = new Solution339.NestedInteger();
        nested2.add(new Solution339.NestedInteger(6));
        nested1.add(nested2);
        list.add(nested1);

        assertEquals(27, solution.depthSum(list));
    }

    @Test
    public void test3() {
        List<Solution339.NestedInteger> list = new LinkedList<>();
        list.add(new Solution339.NestedInteger(0));

        assertEquals(0, solution.depthSum(list));
    }
}
