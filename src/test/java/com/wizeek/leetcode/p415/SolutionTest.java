package com.wizeek.leetcode.p415;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void test1() {
        assertEquals("134", solution.addStrings("11", "123"));
    }

    @Test
    public void test2() {
        assertEquals("533", solution.addStrings("456", "77"));
    }

    @Test
    public void test3() {
        assertEquals("0", solution.addStrings("0", "0"));
    }

    @Test
    public void test4() {
        assertEquals("10", solution.addStrings("5", "5"));
    }
}
