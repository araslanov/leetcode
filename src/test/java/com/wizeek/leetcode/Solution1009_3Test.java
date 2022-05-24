package com.wizeek.leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution1009_3Test {

    private Solution1009_3 solution;

    @Before
    public void setUp() {
        solution = new Solution1009_3();
    }

    @Test
    public void test1() {
        assertEquals(2, solution.bitwiseComplement(5));
    }

    @Test
    public void test2() {
        assertEquals(0, solution.bitwiseComplement(7));
    }

    @Test
    public void test3() {
        assertEquals(5, solution.bitwiseComplement(10));
    }

    @Test
    public void test4() {
        assertEquals(1, solution.bitwiseComplement(0));
    }
}
