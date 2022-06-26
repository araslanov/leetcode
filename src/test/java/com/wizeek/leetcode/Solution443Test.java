package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution443Test {

    private Solution443 solution;

    @Before
    public void setUp() {
        solution = new Solution443();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
    }

    @Test
    public void test2() {
        assertEquals(1, solution.compress(new char[]{'a'}));
    }

    @Test
    public void test3() {
        assertEquals(4, solution.compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
    }
}
