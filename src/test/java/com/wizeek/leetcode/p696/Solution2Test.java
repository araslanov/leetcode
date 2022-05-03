package com.wizeek.leetcode.p696;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution2Test {

    private Solution2 solution;

    @Before
    public void setUp() {
        solution = new Solution2();
    }

    @Test
    public void test1() {
        assertEquals(6, solution.countBinarySubstrings("00110011"));
    }

    @Test
    public void test2() {
        assertEquals(4, solution.countBinarySubstrings("10101"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution.countBinarySubstrings("1"));
    }

    @Test
    public void test4() {
        assertEquals(2, solution.countBinarySubstrings("0010"));
    }

    @Test
    public void test5() {
        assertEquals(3, solution.countBinarySubstrings("001011"));
    }
}
