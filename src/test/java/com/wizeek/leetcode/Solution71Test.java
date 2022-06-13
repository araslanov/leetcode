package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution71Test {

    private Solution71 solution;

    @Before
    public void setUp() {
        solution = new Solution71();
    }

    @Test
    public void test1() {
        assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
    }

    @Test
    public void test2() {
        assertEquals("/home", solution.simplifyPath("/home/"));
    }

    @Test
    public void test3() {
        assertEquals("/", solution.simplifyPath("/../"));
    }
}
