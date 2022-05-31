package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution205Test {

    private Solution205 solution;

    @Before
    public void setUp() {
        solution = new Solution205();
    }

    @Test
    public void test1() {
        assertEquals(true, solution.isIsomorphic("egg", "add"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.isIsomorphic("foo", "bar"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.isIsomorphic("paper", "title"));
    }
}
