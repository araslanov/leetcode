package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution168Test {

    private Solution168 solution;

    @Before
    public void setUp() {
        solution = new Solution168();
    }

    @Test
    public void test1() {
        assertEquals("A", solution.convertToTitle(1));
    }

    @Test
    public void test2() {
        assertEquals("AB", solution.convertToTitle(28));
    }

    @Test
    public void test3() {
        assertEquals("ZY", solution.convertToTitle(701));
    }
}
