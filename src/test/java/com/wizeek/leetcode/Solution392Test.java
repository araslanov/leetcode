package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution392Test {

    private Solution392 solution;

    @Before
    public void setUp() {
        solution = new Solution392();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isSubsequence("abc", "ahbgdc"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isSubsequence("axc", "ahbgdc"));
    }
}
