package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution67Test {

    private Solution67 solution;

    @Before
    public void setUp() {
        solution = new Solution67();
    }

    @Test
    public void test1() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }
}
