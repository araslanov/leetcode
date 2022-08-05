package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution383_2Test {

    private Solution383_2 solution;

    @Before
    public void setUp() {
        solution = new Solution383_2();
    }

    @Test
    public void test1() {
        assertEquals(false, solution.canConstruct("a", "b"));
    }

    @Test
    public void test2() {
        assertEquals(false, solution.canConstruct("aa", "ab"));
    }

    @Test
    public void test3() {
        assertEquals(true, solution.canConstruct("aa", "aab"));
    }
}
